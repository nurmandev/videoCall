# Video Call API

This repository contains a Spring Boot REST API for video Calling management.

## Endpoints

### Register a User

- **URL:** `/api/v1/users/register`
- **Method:** `POST`
- **Request Body:** JSON object representing the user
  ```json
  {
    "username": "example_user",
    "password": "example_password",
    "email": "user@example.com"
  }


### Login a User

- **URL:** `/api/v1/users/login`
- **Method:** `POST`
- **Request Body:** JSON object representing the user login
  ```json
  {
    "password": "example_password",
    "email": "user@example.com"
  }

### LogOut a User

- **URL:** `/api/v1/users/logout`
- **Method:** `POST`
- **Request Body:** JSON object representing the log user Out
  ```json
  {
    "email": "user@example.com"
  }

### Get All Users

- **URL:** `/api/v1/users`
- **Method:** `GET`
- **Request Body:** JSON array containing all users
  

## Overview

The User API provides endpoints for video call but before you create a meeting 
you're required for user registration, login, logout, and fetching all users. It is built using Spring Boot, which makes it easy to deploy and run as a standalone application.

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 
- Git (optional, if you want to clone the repository)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Adebayour66265/videoCall
```

```bash
 cd videoCall
```
### Build and Run the Application

```bash
./mvnw spring-boot:run
```
### Alternatively, you can build a JAR file and run it

```bash
./mvnw clean package
java -jar target/user-api.jar
```