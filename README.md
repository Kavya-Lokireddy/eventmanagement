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
```
src/main/java/com/example/eventmanagement/
├── controller/    # REST Endpoints (API Layer)
├── service/       # Business Logic (Service Layer)
├── repository/    # Database Access (Data Layer)
├── model/         # Data Models (Entities)
├── exception/     # Global Error Handling
└── EventManagementApplication.java  # Main Spring Boot Application

src/main/resources/
└── application.properties  # DB and app configurations

src/test/java/com/example/eventmanagement/
└── service/       # JUnit Tests for Service Layer

pom.xml             # Maven dependencies
README.md           # Project Documentation
```



 POST   | /api/events      \n
 GET    | /api/events/{id} \n
 GET    | /api/events      \n
 PUT    | /api/events/{id}\n
 DELETE | /api/events/{id} \n

