# Eureka Server

Service discovery server used by all microservices for registration and lookup.

## Tech Stack
- Java 17
- Spring Boot 4.0.5
- Spring Cloud Netflix Eureka Server
- Spring Boot Actuator

## Default Configuration
- App name: `EurekaServer`
- Port: `8761`
- `register-with-eureka=false`
- `fetch-registry=false`

## Prerequisites
- JDK 17+
- Maven 3.9+

## Run Locally
```bash
mvn spring-boot:run
```

## Access
- Eureka dashboard: `http://localhost:8761`
- Service URL: `http://localhost:8761/eureka`
