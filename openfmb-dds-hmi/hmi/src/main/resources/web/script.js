/*
 * Copyright 2016 Green Energy Corp.
 *
 * Licensed to Green Energy Corp (www.greenenergycorp.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Green Energy
 * Corp licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
angular.module('openFMB', [])
  .controller('OpenFMBController', function($scope, $http, $interval) {
    var timer,
        baseUrl = '',
        httpConfig = {
          cache:   false,
          timeout: 10000 // milliseconds
        }

    $scope.deviceTypes = {}
    $scope.deviceCount = 0
    $scope.loading = true

    $scope.microgrid = {
      status: '-',
      resource: 0
    }
    $scope.powerTotalByType = {
      solars: 0,
      batteries: 0,
      generation: 0
    }

    //var sampleResponseData = {
    //  "reclosers":{
    //    "DTECH.MGRID.RREC.1":{
    //      isClosed:true,
    //      power: 24,
    //      voltage: 480.4,
    //      frequency: 59.9
    //    }
    //  },
    //  "batteries":{
    //    "DTECH.MGRID.ZBAT.5":{
    //      "mode":"Maintain Minimum Battery SoC",
    //      setpoint: 0,
    //      "soc":50.0,
    //      "isCharging":false,
    //      "power":42.0,
    //      voltage: 480.1,
    //      frequency: 59.9
    //    }
    //  },
    //  //"loads":{}, // loads that are controllable, but not doing yet.
    //  "resources":{ // loads that are not controllable
    //    "Load1": {
    //      "power":8392.099609375
    //    }
    //  },
    //  "solars":{
    //    "SIM01":{
    //      "power":8392.099609375
    //    }
    //  }
    //}
    
    $scope.editPowerSetpoint = function(device) {
      if( ! device.editingPowerSetpointIgnoreClick)
        device.editingPowerSetpoint = true
      else
        device.editingPowerSetpointIgnoreClick = undefined
    }
    $scope.editMode = function(device) {
      if( ! device.editingModeIgnoreClick)
        device.editingMode = true
      else
        device.editingModeIgnoreClick = undefined
    }
    
    function getUrl(resource, device, command) {
      return baseUrl + '/' + resource + '/' + device.name + '/' + command
    }
    
    $scope.setBatteryPowerSetpoint = function(device) {
      var url = getUrl('batteries', device, 'power')
      var data = { power: Number( device.setpointUpdate) }
      device.powerSetpointError = undefined
      $http.post( url, data, httpConfig).then(
        function( response) {
        },
        function( response) {  
          failure( response, 'setBatteryPowerSetpoint')
          device.powerSetpointError = "Error setting batter setpoint"
        }
      )
      device.editingPowerSetpoint = false
      device.editingPowerSetpointIgnoreClick = true
    }
    
    $scope.setBatteryMode = function(device) {
      var url = getUrl('batteries', device, 'mode')
      var data = { mode: Number( device.modeUpdate) }
      device.modeError = undefined
      $http.post( url, data, httpConfig).then(
        function( response) {
        },
        function( response) {  
          failure( response, 'setBatteryMode')
          device.modeError = "Error setting battery mode"
        }
      )
      device.modeUpdate = undefined
      device.editingMode = false
      // device.editingModeIgnoreClick = true
    }
    
    $scope.controlRecloser = function(device, action) {
      var url = getUrl('reclosers', device, action)
      var data = {}
      device.controlError = undefined
      $http.post( url, data, httpConfig).then(
        function( response) {
        },
        function( response) {  
          failure( response, 'setBatteryMode')
          device.controlError = action === 'trip' ? 'Error tripping recloser' : 'Error closing recloser'
        }
      )
      device.modeUpdate = undefined
      device.editingMode = false
      device.editingModeIgnoreClick = true
    }
    
    


    function pollReadingsStart() {
      pollReadingsStop()
      timer = $interval(function() {
  		  getReadings()
  	  }, 1 * 1000)
    }
    function pollReadingsStop() {
      if( timer) {
        $interval.cancel( timer)
        timer = undefined
      }
    }
    
    function updateDevice( device, update) {
      for( var key in update) {
        if( device[key] !== update[key])
        device[key] = update[key]
      }      
    }
    
    function updateDevicesByType( key, updateDevices) {
      var i,
          updateNames =  Object.keys(updateDevices).sort(),
          devices = $scope.deviceTypes[key],
          powerTotal = 0
          
      if( devices === undefined) {
        devices = []
        $scope.deviceTypes[key] = devices
      }

      for( i = 0; i < updateNames.length; i++) {
        var updateName = updateNames[i],
            update = updateDevices[ updateName],
            device = devices[i]
        if( device === undefined || device.name !== updateName) {
          // insert new device
          device = angular.extend( {}, update)
          device.name = updateName
          console.log( "splicing new " + key +  " " + updateName)
          devices.splice( i, 0, device)
        } else {
          updateDevice( device, update)
        }
        powerTotal += device.power
      }

      $scope.powerTotalByType[key] = powerTotal
      
      // Remove any devices of this type that were not in the update
      if( devices.length > updateNames.length) {
        devices.splice(updateNames.length, (devices.length - updateNames.length))
      }

      return updateNames.length
    }

    function applyReadings( data) {

          $scope.deviceCount = 0
          $scope.getReadingsError = undefined
          // zero local generation values
          $scope.powerTotalByType.solars = 0
          $scope.powerTotalByType.batteries = 0
          $scope.powerTotalByType.generation = 0
          $scope.microgrid.resource = 0

          for( var key in data) {
            console.log("getReadings " + key)
            $scope.deviceCount += updateDevicesByType( key, data[key])
          }
          
          // Tally generation totals
          if( ! isNaN($scope.powerTotalByType.solars))
            $scope.powerTotalByType.generation += $scope.powerTotalByType.solars
          if( ! isNaN($scope.powerTotalByType.batteries))
            $scope.powerTotalByType.generation += $scope.powerTotalByType.batteries
          if( ! isNaN($scope.powerTotalByType.resources))
            $scope.microgrid.resource += $scope.powerTotalByType.resources
            
          var recloser = $scope.deviceTypes.reclosers[0]
          if( recloser) {
            $scope.microgrid.status = recloser.isClosed ? "Grid Connected" : "Islanded"
          } else {
            $scope.microgrid.status = 'error'
          }
    }
    
    function getReadings() {
      console.log("getReadings")

      var url = baseUrl + '/data'
      return $http.get( url, httpConfig).then(
        function( response) {
          $scope.loading = false
          applyReadings( response.data)
        },
        function( response) {
          // For debugging without server
          // applyReadings( sampleResponseData)
          $scope.loading = false
          $scope.getReadingsError = true
          failure( response, 'getReadings')
        }
      )
    }


    function failure( response, prefix) {
      var data = response.data === null ? '' : response.data,
      message = prefix + ' failure - status: ' + response.status + ', statusText: ' + response.statusText  + ', data: ' + JSON.stringify(data)
      console.error( message)
      return message
    }

    pollReadingsStart()
  });