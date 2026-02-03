<h1>Event Management REST API</h1>

<b>Project Description</b>
This project is a RESTful Event Management API developed using Spring Boot.  
It allows event organizers to create, update, retrieve, and delete events, and enables users to view event details.  
The application demonstrates REST API design principles, Spring Data JPA integration, and MySQL database usage.

<b>Technologies Used</b>
- Java 21
- Spring Boot 4
- Spring Data JPA
- MySQL
- Maven
- JUnit

<b>Project Structure</b>
src/main/java
 └── com.example.eventmanagement
     ├── controller
     ├── service
     ├── repository
     ├── model
     ├── exception
     └── EventManagementApplication.java

src/main/resources
 └── application.properties

src/test/java
 └── com.example.eventmanagement
     └── service


 POST   | /api/events      
 GET    | /api/events/{id} 
 GET    | /api/events      
 PUT    | /api/events/{id}
 DELETE | /api/events/{id} 

