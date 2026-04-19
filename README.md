# Microservices Project

A Java Spring Boot microservices setup with centralized configuration, service discovery, API gateway routing, and domain services.

## Services
- `config-server` - Centralized configuration via Spring Cloud Config.
- `EurekaServer` - Service registry and discovery server.
- `ApiGateway` - Reactive gateway for routing and cross-cutting concerns.
- `auth-service` - Authentication service with Spring Security, JPA, MySQL, JWT.
- `product-service` - Product domain service with Config Client, Eureka Client, Feign, and circuit breaker support.

## Tech Stack
- Java 17
- Maven
- Spring Boot
- Spring Cloud (Config Server, Eureka, Gateway, OpenFeign)
- Resilience4j
- MySQL (auth-service)
- Redis (optional, for gateway rate limiting)

## Prerequisites
- JDK 17+
- Maven 3.9+
- MySQL running locally (for `auth-service`)
- Redis (optional, when enabling gateway rate limiting)

## Recommended Startup Order
1. `config-server` (`8083`)
2. `EurekaServer` (`8761`)
3. `auth-service` (`8082`)
4. `product-service` (`8084`)
5. `ApiGateway` (`8080`)

## Run Commands
From each service directory:

```bash
mvn spring-boot:run
```

## Quick Access URLs
- Eureka Dashboard: `http://localhost:8761`
- Config Server Endpoint Pattern: `http://localhost:8083/{application}/{profile}`
- API Gateway Base URL: `http://localhost:8080`

## Project Structure
```
microservices-project/
├── ApiGateway/
├── EurekaServer/
├── auth-service/
├── config-server/
└── product-service/
```

## Notes
- Service-level configuration is currently in each service's `application.properties`.
- Check each service README for module-specific setup and caveats.