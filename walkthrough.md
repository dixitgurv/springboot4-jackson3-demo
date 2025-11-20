# Walkthrough - Spring Boot 4 with Jackson 3

I have created a new Spring Boot 4 project configured to use the built-in Jackson 3 support.

## Project Details
- **Location**: `springboot4-jackson3-demo`
- **Spring Boot Version**: `4.0.0-RC1` (Release Candidate)
- **Jackson Version**: Jackson 3 (default in Spring Boot 4)

## Changes
1.  **Project Structure**: Created standard Maven project structure.
2.  **Dependencies**: Configured `pom.xml` to use `spring-boot-starter-parent` version `4.0.0-RC1` and added the `spring-milestones` repository.
3.  **Code**:
    -   Created `DemoApplication.java` entry point.
    -   Created `Message.java` POJO using Jackson 3 annotations (`tools.jackson.annotation.JsonProperty`).
    -   Created `MessageController.java` to expose an endpoint.

## Verification
To verify the setup:
1.  Open the project in an IDE with Maven support.
2.  Ensure dependencies are downloaded (specifically `spring-boot-starter-web` 4.0.0-RC1).
3.  Run the application.
4.  Visit `http://localhost:8080/message` to see the JSON response.

The use of `tools.jackson` package in `Message.java` confirms Jackson 3 usage.
