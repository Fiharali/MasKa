## SPRING FRAMEWORK

This application is a basic User Management System 
built using Spring Core without Spring Boot, 
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations 
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure


### Dependency Injection (DI)
Dependency Injection used to manage dependencies between objects ,  instead of an object creating or managing its dependencies, those dependencies are "injected" or provided to it externally.

### Inversion of Control (IoC)
Inversion of Control  is a principle in software design that reverses the traditional flow of control. Instead of an object controlling its dependencies  IoC shifts this responsibility to an external container or framework, which manages the dependencies and injects them as needed.

### Spring Beans
 Bean is an object managed by the Spring IoC container Beans are created, configured, and managed by the container 

### Bean Scopes
Singleton (default scope): Only one instance of the bean is created for the Spring container.
Prototype: A new instance of the bean is created each time it is requested from the Spring container.
Request: A new instance is created for each HTTP request, available only in web applications.
Session: A new instance is created for each HTTP session, specific to web applications.

### ApplicationContext

### Component Scanning and Stereotype Annotations

### Spring Data JPA

### Spring MVC

### Installation and Setup






