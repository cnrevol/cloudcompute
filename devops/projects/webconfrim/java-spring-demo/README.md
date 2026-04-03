# Java Spring Boot Demo

A minimal Spring Boot application for testing DevOps deployment pipelines.

## Requirements
- Java 17 or higher
- Maven 3.6+

## How to Run

### Using Maven
```bash
mvn spring-boot:run
```

### Build JAR and Run
```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## Test the Application
Once running, visit: http://localhost:8080/

Expected response: `Hello DevOps`

## Project Structure
```
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           └── demo
        │               ├── DemoApplication.java
        │               └── HelloController.java
        └── resources
            └── application.properties