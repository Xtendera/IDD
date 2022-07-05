# Contributing

The following are two methods for compiling the source code into a loadable jar file. After, there is a section on opening pull requests to the project.

## Method 1

Clone the repository with the following command (you need Git installed):

`git clone https://github.com/Xtendera/IDD.git`

Open the project in a recent version of IntelliJ IDEA (Community or Ultimate).

Wait for the IntelliJ to download the dependecies.

Click on the Maven tab on the right.

Go to IDD -> Lifecycle and double-click install for it to build.

The file with outputted both in the _target/_ folder as IDD-$version-SNAPSHOT.jar and in the _build/_ folder as IDD.jar.

## Method 2

This way is a longer way of doing it, and the results are the same so this method is not recommended.

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

## Pull Requests

Creating pull requests is simple.

Fork the code on Github and clone it to your local computer.

`git clone https://github.com/$username/IDD`

Make any modifications to it. Commit the code and push it to Github:

`git commit -m "Cool Update Message"`
`git push`

Create a pull request with an informative title and description.

Changes may be asked to be made. Please be patient and respect me or anyone else who is trying to help get your PR merged.