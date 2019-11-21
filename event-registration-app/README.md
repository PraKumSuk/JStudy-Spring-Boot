Technologies & Pre-requisites :-
- Java 11
- JUnit
- Spring Boot 2.1.6
- MySQL DB
- Apache Maven 3.1.1
- Ensure DB Scripts are run to create DB Table using scripts provided below in DB Scripts file.

Instructions :-
- Update DB details and server port in application.properties
- Run the app using any of below
    - As Spring Boot App 
    - As a Java App i.e. using EventRegistrationApp.java class
    - Using any of below commands from terminal
        java -jar target/event-registration-app-0.0.1-SNAPSHOT.jar
        mvn spring-boot:run
- Open browser and access http://localhost:8082/
- Boom!!! your app should be up and working

Special Notes to Developer :-
- App unit tests added in EventRegistrationAppTest.java class
