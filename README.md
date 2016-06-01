This example shows Stormpath not working correctly when deployed to Pivotal Web Services. Hopefully there is a way around this that I just don't see or a fix coming soon.

#Pre-requisites

This assumes you have a Stormpath account and a Pivotal Web Services account. After you clone this repository, you will need to modify the manifest.yml to include your Stormpath account variables.

#Deploying to PWS

login to cloud foundry

  cf login

build the project

  mvn clean package

deploy to PWS

  cf push
