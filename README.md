# Spring-microservice

# Tutorial: 
* https://medium.com/ms-club-of-sliit/lets-build-a-microservice-with-spring-boot-faf39b968857
* https://github.com/senuravihanjayadeva/Spring-Microservice

# Artefacts:
* IDE or text editor ( Eclipse , Intellij )
* JDK 17
* Maven

# Includes:
* Microservices:
Microservices are a software architecture approach where an application is divided into small, independent and self-contained services that communicate with each other through APIs. This allows for faster development, deployment and scalability.

* Eureka Service Discovery:
the Eureka Service Discovery. Service Discovery is a pattern where client applications can discover the location of services dynamically at runtime. The main idea is to have a central registry of all the services and their current status. This registry can be queried by clients to determine the location of a particular service.
http://localhost:8761/

* API Gateway: 
An API Gateway is a reverse proxy that sits in front of your microservices and acts as a single entry point for incoming API requests. It is responsible for request routing, composition, and protocol translation, among other things.
The API Gateway queries the registry to determine the location of the target microservice, and then forwards the incoming request to that service. In this way, the API Gateway acts as a bridge between client applications and the microservices, providing a unified entry point for incoming requests and abstracting the underlying complexity of the microservices.

* MongoDb:
MongoRepository extends the PagingAndSortingRepository and QueryByExampleExecutor interfaces that further extend the CrudRepository interface. MongoRepository provides all the necessary methods which help to create a CRUD application and it also supports the custom derived query methods

* RestTemplate:
Rest Template is used to create applications that consume RESTful Web Services. You can use the exchange(), getForObject etc methods to consume the web services for all HTTP methods.

# Dependencies
* Spring Web — To include Spring MVC and embedded Tomcat into your project
* Spring Data JPA — Java Persistence API and Hibernate
* MySQL Driver — JDBC Driver
* Lombok — Java library tool that generates code for minimizing boilerplate code. The library replaces boilerplate code with easy-to-use annotations

# Microservices
* schoolservice (MySql)
* studentservice (MongoDb)
* cloud-gateway (api-gateway)
* service-registry (Eureka)

# Pending:
* Add Fault tolerance.
* Add cache
