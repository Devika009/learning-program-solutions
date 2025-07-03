# 📚 Library Management System – Spring Boot Application

This is a simple Spring Boot application that provides RESTful APIs to manage books in a library. It uses Spring Web, Spring Data JPA, and an in-memory H2 database.

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 📦 How to Run

### Prerequisites

- Java 17+
- Maven
- VS Code (recommended)

### Steps

```bash
# Open terminal and navigate to the project directory
cd library-management

# Run the application
./mvnw spring-boot:run


➕ POST /books
Add a new book to the library.

Sample Request
{
  "title": "Clean Code",
  "author": "Robert C. Martin"
}
Sample Response
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin"
}


📚 GET /books
Retrieve all books in the library.

Sample Response
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
