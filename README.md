# Java API Skeleton

A clean and modular Spring Boot project showcasing a typical enterprise REST API structure.

## 🔧 Features
- 🧩 Layered architecture (Controller → Service → Repository)
- 📑 DTO & Entity separation
- 🧼 Global exception handling
- 🔎 Swagger UI integration
- 🛡️ Validation & clean structure

## 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Spring Web
- Spring Validation
- Swagger (Springdoc)
- Maven
- H2 or PostgreSQL

## 📂 Project Structure
com.berke.api
├─ controller/
│    └─ UserController.java
├─ service/
│    └─ UserService.java
├─ model/
│    └─ User.java
├─ dto/
│    └─ UserDto.java
├─ repository/
│    └─ UserRepository.java
└─ exception/
└─ GlobalExceptionHandler.java

