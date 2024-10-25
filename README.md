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
Singleton (default scope): Only one instance of the bean is created for the Spring container. <br>
Prototype: A new instance of the bean is created each time it is requested from the Spring container. <br>
Request: A new instance is created for each HTTP request, available only in web applications. <br>
Session: A new instance is created for each HTTP session, specific to web applications. <br>

### ApplicationContext
ApplicationContext is the providing configuration information to the Spring IoC container ,  It loads bean definitions, manages bean lifecycles, and injects dependencies automatically .

### Component Scanning and Stereotype Annotations
 Component scanning is the process where Spring automatically detects classes annotated with certain stereotypes in specified packages and registers them as beans in the Spring container <br>
Stereotype annotations are used to define the roles of beans. Some commonly used stereotype annotations include: @Component , @Service , @Repository , @Controller .

### Spring Data JPA
Spring Data JPA is a part of the larger Spring Data project, designed to simplify data access in Spring applications by providing an abstraction layer over the Java Persistence API

### Spring MVC
Spring MVC is a framework within the Spring Framework that provides a powerful way to build web applications in Java. It follows the MVC design pattern

### Installation and Setup






