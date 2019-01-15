# Simplified OpenFMB DDS Based Demonstration 


This repository contains an implementation of the simplified OpenFMB demonstration using the DDS Security standard and RTI Connext DDS Secure implementation. The repository provides the simulators for ESS, Solar and the Recloser.  When building this repository, a single jar is produced with different entry points to start the different simulators.  Each simulator has a properties file to define the OpenFMB ID information and how the simulator operates. In addition, the Island Balancer application can be initiated by an entry point in the same jar.   The Island Balancer application subscribes to the loadpublisher, solar, recloser and ESS to determine the state of the microgrid and the appropriate discharge of the ESS during a microgrid island state. Click [here]( https://openfmb.ucaiug.org/) for more information about [OpenFMB]( https://openfmb.ucaiug.org/). 

You can *Download* the latest stable release [here](https://github.com/rticommunity/openfmb-dds-demo/releases).


