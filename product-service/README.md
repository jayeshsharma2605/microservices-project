# Product Service

Spring Boot microservice for product-related APIs, integrated with Eureka, Config Server, and resilience features.

## Tech Stack
- Java 17
- Spring Boot 3.2.5
- Spring Cloud (Eureka Client, Config Client, OpenFeign)
- Resilience4j Circuit Breaker
- Spring Web + Actuator

## Default Configuration
- App name: `PRODUCT-SERVICE`
- Port: `8084`
- Eureka URL: `http://localhost:8761/eureka`
- Config Server import: `optional:configserver:http://localhost:8083`

## Prerequisites
- JDK 17+
- Maven 3.9+
- Running `EurekaServer` on `8761`
- Running `config-server` on `8083`

## Run Locally
```bash
mvn spring-boot:run
```

## Health and Monitoring
- Actuator endpoints are exposed with: `management.endpoints.web.exposure.include=*`
