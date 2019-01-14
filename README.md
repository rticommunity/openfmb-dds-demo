# Simplified OpenFMB DDS Based Demonstration 

## Description

This repository contains an implementation of the simplified OpenFMB demonstration using the DDS Security standard and RTI Connext DDS Secure implementation. The repository provides the simulators for ESS, Solar and the Recloser.  When building this repository, a single jar is produced with different entry points to start the different simulators.  Each simulator has a properties file to define the OpenFMB ID information and how the simulator operates. In addition, the Island Balancer application can be initiated by an entry point in the same jar.   The Island Balancer application subscribes to the loadpublisher, solar, recloser and ESS to determine the state of the microgrid and the appropriate discharge of the ESS during a microgrid island state. Click [here]( https://openfmb.github.io/) for more information about [OpenFMB]( https://openfmb.github.io/). 


## Installing 

The example has been configured and tested on Ubuntu 16.04 64 bit.

You need the following components installed on your system:
- Google Chrome
- Git
- Java

To install Google Chrome download the package from [Google](https://www.google.com/chrome/browser/desktop/index.html) and save the file. To install run:
`sudo dpkg -i google-chrome-stable_current_amd64.deb`
If you experience any errors or missing dependencies during the install run

`sudo apt-get install -f`

to install the missing dependcies and run the chrome install again

`sudo dpkg -i google-chrome-stable_current_amd64.deb`

The additional packages git, jre and jdk can be installed as follow:

`sudo apt-get install default-jre default-jdk git`

Once the packages are installed you can clone the repository:
`git clone https://github.com/openfmb/openfmb-dds-demo`

The repository includes an evaluation version of RTI Connext DDS Secure. To run the example you need to set the following environment variables:

`NDDSHOME = <repository_path>/rti_connext_dds-5.3.0`

`PATH = $NDDSHOME/bin:$PATH`

`LD_LIBRARY_PATH=$NDDSHOME/lib/x64Linux3gcc5.4.0:$NDDSHOME/resource/app/lib/x64Linux2.6gcc4.1.1/:$LD_LIBRARY_PATH`

If you already have your own installation of RTI Connext DDS Secure, make sure that the environment variables mentioned above are correctly set to your installation. 

RTI Connext DDS Secure is commercial software provided for use with this demonstration under an Evaluation License.  Use of the demonstration is limited to uses compatible with that license.  You can find the license in the installation at <repository_path>/rti_connext_dds-5.3.0/RTI_License_Agreement.pdf.  A temporary license key to enable the software is included at <repository_path>/rti_connext_dds-5.3.0/rti_license.dat.


## Getting started

To start the demo, go to the scripts directory and run:
`./simgo.sh`

The script will start the ESS, Solar, Recloser, Balancer, Load simulator, and HMI applications. The script will bring up a Chrome web browser with the information from each component. 

In the scripts directory you will also find scripts to start each of the components individually as well as the configuration files. 
 

To run another solar simulator you will need to modify the simulator properties file and start a second instance of the solar simulator. Note that the key items to change are the ID and MRID to avoid conflict.  In this case we incremented the suffix to 2. For example:

```
 device.logicalDeviceID=DEMO.MGRID.SOLAR.2
 device.mRID=DEMO.MGRID.SOLAR.2
```

To run the simulator with this property file you will need to be in the same directory as the jar to use the following command.

```
java -cp openfmb-simulators-0.0.5-SNAPSHOT-jar-with-dependencies.jar -Dconfig.sim.path=solarsim2.properties  com.greenenergycorp.openfmb.simulator.solar.SolarSimulator
```

The HMI will now show a new solar device on the web page.


## Building

The demo consists of 5 different components:

- openfmb-dds-common. This component contains the generated DDS support files and the wrappers around the DDS connections.
- openfmb-dds-simulators. This component contains the ESS, Solar, Recloser, and Balancer simulators.
- openfmb-dds-loadpublisher. This component contains the load publisher simulator. 
- openfmb-dds-hmi. This component contains the driver for the Web UI. 

Maven project files are available for the different components. Before building the RTI DDS jar file needs to be added to maven. This is done as follow:

`mvn install:install-file -Dfile=$NDDSHOME/lib/java/nddsjava.jar -DgroupId=RTI -DartifactId=DDS -Dversion=5.3.0 -Dpackaging=jar`

The maven project files are setup to use the RTI DDS jar file. The build order is openfmb-dds-common project followed by openfmb-dds-simulator, openfmb-dds-loadpublisher, and openfmb-dds-hmi. 

```
cd openfmb-dds-common
mvn clean install 

cd ../openfmb-dds-simulator 
mvn clean install -Pslf4j-simple

cd ../openfmb-dds-loadpublisher 
mvn clean install

cd ../openfmb-dds-hmi 
mvn clean install

```

The commands above will build the jar files in the target directory from where the script will run them. 
 

## Using the RTI Connext Secure Admin Console

The demo is configured to use security. The cert directory contains the needed certification, governance, and permission files. Each application has its specific permissions file. Im addition, there is a generic permissions file that is used by the RTI Connext tools. 


You can start the Admin Console through the launcher or simply by typing:
`rtiadminconsole`
If you don't see any information in the Admin Console check the security configuration as it is disabled by default. Go to View -> Preferences and select Security. The configuration should look similar to the example below. The path will be different depending on the install directory of the openFMB demo. 

![Admin Console Secure Config](https://github.com/openfmb/openfmb-dds-demo/blob/master/images/admin_console.png "Admin Console Security Preferences"). 

 

