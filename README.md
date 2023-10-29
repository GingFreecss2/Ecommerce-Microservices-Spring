# Ecommerce Microservices Project using Spring

An Ecommerce Microservices project, a simple online shopping application built with Spring. This project demonstrates various features and components for creating a robust microservices-based e-commerce platform.

## Project Features

- **Service Discovery**: Utilizes Netflix Eureka for service discovery.
- **Centralized Configuration**: Centralized configuration management.
- **Distributed Tracing**: Incorporates tracing for monitoring and diagnostics using Zipkin.
- **Event-Driven Architecture**: Utilizes Kafka for event-driven communication.
- **Centralized Logging**: Centralized log management for easy debugging.
- **Circuit Breaker**: Implements a circuit breaker pattern for fault tolerance using Resilience4j .
- **Secure Microservices**: Integrates Keycloak for securing microservices.
- **API Gateway**: Implements an API Gateway using Spring Cloud Gateway.
- **Dockerized Application**: Docker containers for easy deployment.
- **Database Usage**: Utilizes MongoDB for the product service, MySQL for the order service, and MySQL for the inventory service.

## Project Services

1. **Product Service**: Manages product catalog, allowing product creation and viewing.
2. **Order Service**: Checks product availability for orders.
3. **Notification Service**: Sends notifications after an order is placed.

These services interact with each other using both synchronous and asynchronous communication patterns.

## High-Level Architecture Diagram

![High-Level Architecture Diagram](/images/high_level_architecture.png)

## Logical Architecture Diagram

![Logical Architecture Diagram](/images/logical_architecture.png)

Please note that this project does not include detailed documentation for each service. If you have any specific questions or need assistance, feel free to reach out or explore the source code in the individual service directories.
.
