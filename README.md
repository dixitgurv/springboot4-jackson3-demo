# Spring Boot 4 + Jackson 3 Demo

This project demonstrates a Spring Boot 4 application using the built-in Jackson 3 support.

## Prerequisites
- Java 17 or later
- Maven (or use your IDE's built-in Maven)

## Project Structure
- **Spring Boot Version**: 4.0.0-RC1
- **Jackson Version**: 3.x (managed by Spring Boot)

## Key Features
- Uses `tools.jackson.annotation.JsonProperty` instead of `com.fasterxml.jackson.annotation.JsonProperty`.
- Demonstrates that Spring Boot 4 defaults to Jackson 3.

## How to Run
1. Open the project in your IDE (IntelliJ IDEA, Eclipse, VS Code).
2. Run `DemoApplication.java`.
3. Access the endpoint: `http://localhost:8080/message`

## Verification
The `Message` class uses the new Jackson 3 package `tools.jackson`:
```java
import tools.jackson.annotation.JsonProperty;
```
This confirms that the application is using Jackson 3.
