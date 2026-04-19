# Auth Service

Spring Boot authentication service for user login, registration, and JWT token handling.

## Tech Stack
- Java 17
- Spring Boot 3.2.5
- Spring Security
- Spring Data JPA
- MySQL
- JJWT

## Default Configuration
- App name: `AUTH-SERVICE`
- Port: `8082`
- Database: `jdbc:mysql://localhost:3306/authdb`

## Prerequisites
- JDK 17+
- Maven 3.9+
- MySQL running locally with a database named `authdb`

## Run Locally
```bash
mvn spring-boot:run
```

## Important Notes
- Move secrets like DB password and JWT secret to environment variables or external config before production use.
- JPA is currently set to `spring.jpa.hibernate.ddl-auto=update`.
