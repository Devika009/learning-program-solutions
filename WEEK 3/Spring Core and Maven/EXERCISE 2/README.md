# 📚 Library Management System – Spring Boot Application

This is a simple Spring Boot application that provides RESTful APIs to manage books in a library. It demonstrates the use of Spring Web, Spring Data JPA, and Dependency Injection via a service layer. An in-memory H2 database is used to store book data.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🚀 How to Run

### Prerequisites

- Java 17+
- Maven
- VS Code or any Java IDE

### Steps

```bash
# Navigate to the project directory
cd library-management

# Run the application
./mvnw spring-boot:run

➕ POST /books
Add a new book

Request (JSON)
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}

Response (JSON)
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin"
}


📚 GET /books
Retrieve all books

Response (JSON)
[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin"
  },
  {
    "id": 2,
    "title": "Spring in Action",
    "author": "Craig Walls"
  }
]
