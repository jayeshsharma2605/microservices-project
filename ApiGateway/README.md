# API Gateway

Reactive API gateway for routing requests to backend microservices with resilience and rate limiting support.

## Tech Stack
- Java 17
- Spring Boot 3.2.5
- Spring Cloud Gateway
- Eureka Client
- Config Client
- Resilience4j (reactor circuit breaker)
- Reactive Redis (rate limiting)

## Default Configuration
- App name: `ApiGateway`
- Port: `8080`
- Config Server import: `optional:configserver:http://localhost:8083`
- Redis rate limiter defaults:
  - `replenishRate=5`
  - `burstCapacity=10`

## Prerequisites
- JDK 17+
- Maven 3.9+
- Running `config-server` on `8083`
- Redis (if rate limiting is enabled)

## Run Locally
```bash
mvn spring-boot:run
```

## Notes
- Most route definitions are currently commented in `application.properties`.
- If you want service discovery based routing, set and verify `eureka.client.service-url.defaultZone`.
