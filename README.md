# Spring Boot E-Commerce Backend

A RESTful E-Commerce backend application built using Spring Boot and Spring Security with JWT Authentication and Role-Based Authorization.

## Features

* User Registration
* User Login with JWT Authentication
* Access Token and Refresh Token Generation
* BCrypt Password Encryption
* Role-Based Authorization (ADMIN and CUSTOMER)
* User CRUD Operations
* Address Management
* Stateless Authentication using JWT
* Global Exception Handling
* RESTful APIs

## Technologies Used

* Java
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* ModelMapper
* 
## Spring Security Architecture

![Spring Security](https://media.geeksforgeeks.org/wp-content/uploads/20240411143037/Spring-Security-Architecture.webp)

## User Roles

### ADMIN

* View all users
* View user details
* Update users
* Delete users
* Manage products

### CUSTOMER

* Register an account
* Login to the application
* View user details
* Update profile information
* Browse products

## Authentication APIs

### Register User

**POST** `/api/auth/register`

### Login User

**POST** `/api/auth/login`

Returns:

* Access Token
* Refresh Token
* User Details

## User APIs

### Get All Users

**GET** `/api/users`

### Get User By ID

**GET** `/api/users/{id}`

### Update User

**PUT** `/api/users/{id}`

### Delete User

**DELETE** `/api/users/{id}`

## Product APIs

### Get Products

**GET** `/api/products`

Accessible by:

* ADMIN
* CUSTOMER

### Create Product

**POST** `/api/products`

Accessible by:

* ADMIN

### Update Product

**PUT** `/api/products/{id}`

Accessible by:

* ADMIN

### Delete Product

**DELETE** `/api/products/{id}`

Accessible by:

* ADMIN

## Security Configuration

* JWT-based Authentication
* Stateless Session Management
* Public Endpoints:

  * `/api/auth/**`
* Protected Endpoints:

  * `/api/users/**`
  * `/api/products/**`

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/sushmitha-katika-dev/spring-security-ecommerce.git
```

### Navigate to Project Directory

```bash
cd spring-security-ecommerce
```

### Configure Database

Update `application.yml` with your MySQL configuration.

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## Future Enhancements

* Category Management
* Shopping Cart
* Order Management
* Payment Integration
* API Documentation using Swagger/OpenAPI
* Unit and Integration Testing

## Author

Developed as part of a Spring Boot and Spring Security learning project.
