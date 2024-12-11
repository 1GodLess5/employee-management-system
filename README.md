# Employee Management System Backend

The **Employee Management System Backend** is a Spring Boot application designed to provide the server-side functionality for managing employees. This application exposes a REST API to interact with the employee data and supports full CRUD (Create, Read, Update, Delete) operations. You can find the frontend here: [Employee Management System Frontend](https://github.com/1GodLess5/employee-management-system-frontend).

---

## Features

- **REST API**: Exposes endpoints for managing employees.
- **Database Integration**: Uses JPA for interaction with the database.
- **Error Handling**: Implements a global exception handler for consistent API responses.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**

---
## API Endpoints

### Base URL
```
/api/employees
```

### Endpoints

| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| GET    | `/`                | Fetch all employees    |
| GET    | `/{id}`            | Fetch employee by ID   |
| POST   | `/`                | Create a new employee  |
| PUT    | `/{id}`            | Update employee by ID  |
| DELETE | `/{id}`            | Delete employee by ID  |

---
