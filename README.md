# Steps to deploy:
- At the root folder, run "mvn package". Once completed, you should see a "target" folder
generated containing a war file and other folders.
- Open the manifest.yml, and edit the appname or hostname if necessary
- Run "cf push"

Maven Note: For mvn command to run properly, the .java source file must be located in format of src/main/java (default location where maven compiler find source file)
