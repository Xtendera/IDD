# IDD
This plugin allows you to enable the mule dupe (IDD) on your server. The plugin is a remake of SweetAnarchy's IDD plugin.

This plugin supports both Spigot and Paper servers.

## Options

| Name | Description | Value |
| --------------- | --------------- | --------------- |
| dupeMultiplier | Controls how many times to dupe the item | >1 (default: 2) |

## Compiling

Clone the repository with the following command (you need Git installed):

`git clone https://github.com/Xtendera/IDD.git`

Open the project in a recent version of IntelliJ IDEA (Community or Ultimate).

Wait for the IntelliJ to download the dependecies.

Click the gear icon at the top right and select _Project Structure_.

![Image to show Project Structure access](https://i.imgur.com/Le4w35U.png)

Go to the artifacts tab and click the plus icon, then go to jar and select _From modules with dependencies_.

![Artifact adding](https://imgur.com/06IPi5i.png)

Click OK without modifying anything.

Inside the IDD:jar artifact, click the plus icon dropdown, and choose file.

![Adding config files](https://imgur.com/rLUy3sv.png)

Select the the two files under src/main/resources and click OK.

![Adding config files](https://imgur.com/I0ITNlv.png)

Click apply then OK. Go to Build -> Build artifacts to build the jar and it will be outputted to out/IDD_/IDD.jar.

