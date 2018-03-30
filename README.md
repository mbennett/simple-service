# simple-service

This is a simple microservice that has the following dependencies:

- **config-client**
- **service-registry**

The service can be deployed to cloud foundry as long as there is a service registry and a config server available (see **manifest.yml** for details). The config file **simple-service-dev.yml** needs to be pushed to the config server.

This is a Maven version of https://github.com/sdesa/simple-service (which uses Gradle) along with any changes I might make.
