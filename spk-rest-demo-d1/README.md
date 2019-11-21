App Info :-
- Describes usage of Spring Boot, Restful API Service and first Docker Application.
- Application has 3 APIs to fetch all user details, add a new user and delete an existing user
- For complete list of APIs, Request & Responses refer below link
	https://www.getpostman.com/collections/1cd9b2c7ba96dd0e5934

Technologies & Pre-requisites :-
- Java 11
- JUnit
- Spring Boot 2.1.6
- Apache Maven 3.1.1
- Docker
- Docker Hub Account

Instructions to host application :-
- Update server port in application.properties
- Run the app as Spring Boot App or as a Java App using SpkRestDemoD1App.java class
- Open browser and access http://localhost:8082/
- Boom!!! your app should be up and working

Unit Tests :-
- App unit tests added in SpkRestDemoD1AppTest.java class

Docker Instructions :-
- CD to the root of the project directory
- To build a docker image run below cmd

	docker build -t praveespkjava/spk-rest-demo-d1-app:spkv1.0 .
	
  Note : Its a best practise to have the image name in the format 'dockerUserName/actualAppName:tagOrVersionName'
	i.e. in the above example 'praveespkjava' is the docker hub username, 'spk-rest-demo-d1-app' is the app name and 			'spkv1.0' is the tag/version name. 
	Also note that if the tag name is not provided by default docker would add it as 'latest'
- Login to your docker hub or repository from terminal

	docker login -u <username> -p <password>
- Also login to hub.docker.com UI and create a repository for the app's image to be pushed. for e.g. set below 
	Repository Name : spk-rest-demo-d1-app
	Visibility : Public
- To push the image to repository run below cmd from terminal
	
	docker push praveespkjava/spk-rest-demo-d1-app:spkv1.0
	
  Note : Image name is praveespkjava/spk-rest-demo-d1-app:spkv1.0.
	Image name can be verified by running docker image ls
