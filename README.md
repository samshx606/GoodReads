
# Goodreads

Goodreads is a RESTful web application built using Spring Boot that allows users to register, log in, manage books, and write reviews. Each review is linked to a specific book and a user. Users can also fetch book data and view reviews made by others.

---

## Features

- User Registration & Login
- Add, Update, Delete Books
- Create, Update, Delete Reviews
- View Reviews by Book or User
- Get List of All Users
- Retrieve All Books & Reviews

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- RESTful API
- Jackson (for JSON)

---

## API Endpoints

Base Path: `/api/v1`  
Port: `8090`

### User Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/v1/users/register` | Register a new user |
| `POST` | `/api/v1/users/login` | Login with credentials |
| `GET`  | `/api/v1/users` | Get all users |
| `DELETE` | `/api/v1/users/{id}` | Delete a user by ID |

### Book Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/v1/books` | Add a new book |
| `PUT`  | `/api/v1/books` | Update a book |
| `GET`  | `/api/v1/books` | Get all books |
| `DELETE` | `/api/v1/books/{id}` | Delete a book |

### Review Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/v1/reviews` | Add a new review |
| `PUT`  | `/api/v1/reviews` | Update existing review |
| `GET`  | `/api/v1/reviews` | Get all reviews |
| `DELETE` | `/api/v1/reviews/{id}` | Delete review by ID |

---

## Prerequisites

- Java 17+
- Maven
- MySQL Server

---

## Installation

1. **Clone the Repository**
   ```bash
   https://github.com/samshx606/GoodReads.git
   cd GoodReads
   ```

2. **Create MySQL Database**
   ```sql
   CREATE DATABASE goodreads;
   ```

3. **Configure Application Properties**

   Update `src/main/resources/application.properties`:
   ```properties
   server.port=8090
   spring.datasource.url=jdbc:mysql://localhost:3306/Goodreads?createDatabaseIfNotExist=true
   spring.datasource.username=your_mysql_user
   spring.datasource.password=your_mysql_password
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**
   ```
   http://localhost:8090
   ```

---
