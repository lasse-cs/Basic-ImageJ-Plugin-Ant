# ImageJ 1.x Plugins using Ant

Basic Outline for developing ImageJ 1.x Plugins using Java and Ant

## Setup

Create a file called `plugin.properties` in the root directory.
In this file set:
* Name of plugin: `plugin.jar=MY_PLUGIN_NAME.jar`
* ImageJ Directory: `imagej.root=IMAGEJ_DIRECTORY`
* Lib folder: `lib.folder=LIB_DIRECTORY`

## Commands

To compile the Plugin, create the JAR and copy it to the ImageJ plugins folder execute `ant deploy`. This is also the default command.