# Config Server

Spring Cloud Config Server that serves centralized configuration for microservices.

## Tech Stack
- Java 17
- Spring Boot 4.0.5
- Spring Cloud Config Server
- Spring Web MVC + Actuator

## Default Configuration
- App name: `config-server`
- Port: `8083`
- Backing Git repo: `https://github.com/jayeshsharma2605/microservices-project`
- Active profile: `dev`

## Prerequisites
- JDK 17+
- Maven 3.9+
- Network access to configured Git repository

## Run Locally
```bash
mvn spring-boot:run
```

## Usage
- Example config lookup:
  - `http://localhost:8083/{application}/{profile}`
  - Example: `http://localhost:8083/product-service/dev`

## Notes
- There are duplicate `spring.cloud.config.server.git.search-paths` entries in `application.properties`; keep only the intended one for predictable behavior.
