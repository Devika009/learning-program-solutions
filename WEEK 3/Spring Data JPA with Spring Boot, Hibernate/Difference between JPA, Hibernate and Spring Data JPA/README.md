# 🧑‍💻 Java Employee Management System

This repository demonstrates two approaches to building a simple **Employee Management System** using Java and MySQL:

1. `hibernate-example/` — Implementation using **Hibernate (without Spring)**
2. `springdatajpa-example/` — Implementation using **Spring Boot and Spring Data JPA**

Both implementations demonstrate how to persist employee data into a MySQL database.

---

## 📚 Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Database Setup](#database-setup)
- [Running the Projects](#running-the-projects)
  - [Hibernate (without Spring)](#1-hibernate-without-spring)
  - [Spring Boot + Spring Data JPA](#2-spring-boot--spring-data-jpa)
- [Sample Output](#sample-output)
- [Comparison: Hibernate vs Spring Data JPA](#comparison-hibernate-vs-spring-data-jpa)
- [References](#references)
- [Author](#author)

---

## ✅ Features

- Add an employee to the MySQL database
- Demonstrates differences between manual Hibernate session handling and Spring-managed repositories
- Uses JPA annotations in both implementations

---

## 🛠️ Technologies Used

- Java 17
- Hibernate 5+
- Spring Boot 3+
- Spring Data JPA
- MySQL 8
- Maven
- IDE: VS Code / Eclipse

---

## 🗃️ Database Setup

Before running either project, create the following MySQL databases:

```sql
CREATE DATABASE hibernatedb;
CREATE DATABASE springdb;

📤 Sample Output
Hibernate Example Output (Console)
Hibernate: insert into employee (department, name) values (?, ?)
Employee saved with ID: 1

Spring Boot + Spring Data JPA Output (Console)
Hibernate: insert into employee (department, name) values (?, ?)
Employee saved!

And in your MySQL database (select * from employee;):
+----+----------+-------+
| id | name     | department |
+----+----------+------------+
|  1 | Alice    | HR         |
+----+----------+------------+
