# Spring Boot 4 + Jackson 3 Demo

This project demonstrates a Spring Boot 4 application using the built-in Jackson 3 support.

## Prerequisites
- Java 17 or later
- Maven (or use your IDE's built-in Maven)

## Project Structure
- **Spring Boot Version**: 4.0.0-RC2
- **Jackson Version**: 3.x (managed by Spring Boot)

## Key Features
- Demonstrates that Spring Boot 4 defaults to Jackson 3.
- **Important Note on Annotations**: Even though Jackson 3 moved most classes to the `tools.jackson` package, it **retains** `com.fasterxml.jackson.annotation` for annotations (like `@JsonProperty`) to ensure backward compatibility.

## How to Run
1. Open the project in your IDE (IntelliJ IDEA, Eclipse, VS Code).
2. Run `DemoApplication.java`.
3. Access the endpoint: `http://localhost:8080/message`

## Verification
The `Message` class uses the compatible annotation package:
```java
import com.fasterxml.jackson.annotation.JsonProperty;
```
This is required because Jackson 3 keeps annotations in the old package to allow libraries to support both Jackson 2 and 3 simultaneously. However, the underlying engine and databind classes are from `tools.jackson` (Jackson 3).
