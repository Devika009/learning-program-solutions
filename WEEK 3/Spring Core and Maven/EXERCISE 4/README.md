# 📘 Exercise 4: Creating and Configuring a Maven Project

This project demonstrates how to set up a Spring Boot application using Maven for a Library Management System. It includes all the necessary Spring Boot components and follows a clean project structure.

---

## 🎯 Objective

- Set up a new Maven project
- Add Spring Boot dependencies
- Configure the application structure
- Build and run the backend using REST APIs

---

## 🛠 Technologies Used

- Java 17
- Maven
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database

---

## 📦 How the Project Was Created

This project was created using Maven, either:
- Manually via terminal or
- Using [Spring Initializr](https://start.spring.io)

Steps followed:
1. Created a Maven project with package structure `com.example.library`
2. Added dependencies for Spring Boot Web, JPA, H2
3. Created main class `LibraryManagementApplication.java`
4. Implemented model, repository, service, and controller layers
5. Configured `application.properties` for database setup

---

## 🚀 How to Run

```bash
# Navigate to the project directory
cd library-management-ex4

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

➕ POST /books
Request:
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
Response:
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin"
}

📚 GET /books
Response:
[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin"
  }
]
