App Info :-
- Describes usage of Spring Boot, Restful API Service and first Docker Application.
- Application has 3 APIs to fetch all user details, add a new user and delete an existing user
- For complete list of APIs, Request & Responses refer below link
	https://www.getpostman.com/collections/1cd9b2c7ba96dd0e5934
	
	Note : This is an extension of spk-rest-demo-d1 app, where swagger is used to create documentation

Technologies & Pre-requisites :-
- Java 11
- JUnit
- Spring Boot 2.1.6
- Apache Maven 3.1.1
- Docker
- Docker Hub Account
- Swagger2

Instructions to host application :-
- Update server port in application.properties
- Run the app as Spring Boot App or as a Java App using SpkRestDemoD1App.java class
- Open browser and access 
	http://localhost:8082/users

- To access default Swagger documentation
	http://localhost:8082/v2/api-docs
	
- To access Swagger documentation UI. 
	http://localhost:8082/swagger-ui.html
	
	Note : This will create UI automatically with all required fields, so you can test the service and playaround with it. It will also show sample request inputs with data types that can be sent	

Terminal / Command Prompt :-
mvn clean install 
java -jar target/spk-rest-swagger-demo-d2-0.0.1-SNAPSHOT.jar --server.port=8082 --spring.profiles.active=dev

