# Blog App Backend

This project contains the backend part of a blog site implemented using Spring Boot. The project interacts with a MySQL database through RESTful APIs. Security is provided using JSON Web Token (JWT), and the APIs have been tested and documented using Postman and Swagger.

## Features

- **Post:** Entity representing blog posts.
- **Comment:** Entity representing comments on posts.
- **Category:** Entity representing categories of blog posts.
- **User:** Entity representing registered users in the system.

## Technologies

- Spring Boot
- MySQL
- JWT (JSON Web Token)
- Postman (for API testing)
- Swagger (for API documentation)

## How to Run

To run the project, follow these steps:

1. Create your MySQL database.
2. Edit the `application.properties` file with your database connection details.
3. Start the application by running the following command in the project's root directory:

    ```bash
    ./mvnw spring-boot:run
    ```

## API Documentation

![Swagger](https://github.com/omrfth23/Blog-App-RESTful-Backend-SpringBoot/blob/master/Screenshots/screencapture-localhost-8080-swagger-ui-index-html-2024-01-14-22_42_08.png?raw=true)





