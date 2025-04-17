Employee Manager - CRUD REST API with Spring Boot

This is a Spring Boot-based CRUD REST API that manages employee records in a MySQL database. It allows clients to perform create, read, update, and delete operations on employee data via RESTful endpoints.

Features:

- Full CRUD operations (Create, Read, Update, Delete)

- REST API using Spring Boot

- Integration with MySQL database

- Spring Data JPA and Hibernate ORM

- Project auto-configuration with Spring Boot

- Easy testing with tools like Postman or curl

- Technologies Used: Java 17+, Spring Boot, Spring Data JPA, MySQL, Maven, Postman

Setup Instructions:

Prerequisites:

- Java 17 or newer

- MySQL installed and running

- Maven installed

Steps to Run:

1. Clone the Repository: git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

2. Create the Database in MySQL: CREATE DATABASE ems;

3. Update src/main/resources/application.properties with: spring.datasource.url=jdbc:mysql://localhost:3306/ems?useSSL=false
spring.datasource.username=root
spring.datasource.password=Mysql123
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

4. Run the application: If using Maven Wrapper:
./mvnw spring-boot:run

5. If using Maven globally:
mvn spring-boot:run

API Endpoints: GET /api/employees - Get all employees
GET /api/employees/{id} - Get employee by ID
POST /api/employees - Add a new employee
PUT /api/employees/{id} - Update an existing employee
DELETE /api/employees/{id} - Delete an employee

You can test these endpoints using Postman, curl, or Swagger UI (if added).

Author:
Zaara Javed
GitHub: https://github.com/zaarajaved
LinkedIn: https://www.linkedin.com/in/zaarajaved

License:
This project is licensed under the MIT License.
