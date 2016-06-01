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
  
# The Problem
  
It runs fine locally.  But when I deploy it to Pivotal Web Services, it doesn't work right.  I left out the values for the environment variables in the manifest.yml for security reasons.  But you can replace those with your own values to demonstrate the problem.

On PWS, after you login to the app, it shows "Who are you?"  But when run locally, it will show your name.  On PWS, it lets you in, but doesn't seem to know who you are.
