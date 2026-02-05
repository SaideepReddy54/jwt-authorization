# Spring Boot JWT Authentication Demo

## 📌 Project Overview

This project is a **Spring Boot REST API** secured using **Spring Security** and **JWT (JSON Web Token)** authentication.
It demonstrates **stateless authentication**, user **registration**, **login**, and access to **protected APIs** using a JWT token.

The application uses an **H2 in-memory database**, so no external database setup is required.

---

## 🛠️ Technologies Used

* Java 17+
* Spring Boot 3
* Spring Security
* JWT (io.jsonwebtoken)
* Spring Data JPA / Hibernate
* H2 In‑Memory Database
* Lombok
* Maven

---

## 📂 Project Features

* User Registration
* User Login with JWT Token Generation
* Password Encryption using BCrypt
* Stateless Authentication using JWT
* Secured REST APIs
* Public and Protected Endpoints
* H2 Database Console for testing

---

## 🔐 Authentication Flow

1. User **registers** using `/api/auth/register`.
2. User **logs in** using `/api/auth/login`.
3. Server **validates credentials** and generates a **JWT token**.
4. Client sends the token in the header:

   ```
   Authorization: Bearer <JWT_TOKEN>
   ```
5. `JwtFilter` validates the token on each request.
6. If valid → access to **secured APIs** is granted.

---

## 🚀 Running the Application

### 1️⃣ Clone the repository

```bash
git clone <your-repo-url>
cd jwt
```

### 2️⃣ Build and run

```bash
mvn spring-boot:run
```

Application starts at:

```
http://localhost:8080
```

---

## 🌐 API Endpoints

### 🔓 Public API

```
GET /api/public/hello
```

Response:

```
Hello World - Public API
```

---

### 📝 Register User

```
POST /api/auth/register
```

Request Body:

```json
{
  "username": "Saideep",
  "password": "Saideep@123"
}
```

Response:

```
User Registered Successfully
```

---

### 🔑 Login & Get JWT Token

```
POST /api/auth/login
```

Request Body:

```json
{
  "username": " Saideep",
  "password": "Saideep@123"
}
```

Response:

```
<JWT_TOKEN>
```

---

### 🔒 Secured API (Requires Token)

```
GET /api/secure/hello
```

Header:

```
Authorization: Bearer <JWT_TOKEN>
```

Response:

```
Hello World - JWT Authenticated
```

Without token → **401 Unauthorized**

---

## 🗄️ H2 Database Console

Access H2 console at:

```
http://localhost:8080/h2-console
```

Use the following configuration:

* JDBC URL: `jdbc:h2:mem:testdb`
* Username: `sa`
* Password: *(leave empty)*

You can run:

```sql
SELECT * FROM USERS;
```

---

## 🧠 Key Concepts Demonstrated

* Spring Security configuration using `SecurityFilterChain`
* JWT token creation and validation
* Stateless authentication (no session storage)
* Password hashing using BCrypt
* RESTful API design

---

## 📈 Future Improvements

* Role‑based authorization (ADMIN / USER)
* Refresh token mechanism
* Global exception handling
* Swagger/OpenAPI documentation
* MySQL or PostgreSQL integration
* Docker deployment

---
