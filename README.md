Employee Management System (CLI Based)
1. Introduction

The Employee Management System is a console-based (CLI) application developed using Core Java, JDBC, and MySQL.
The system helps manage employee records such as adding new employees, viewing employee details, updating salary, searching by ID, and deleting employee records.

This project demonstrates how Java applications interact with databases using JDBC and follows a layered architecture for better code organization and maintainability.

2. Objectives of the Project

To understand JDBC connectivity with MySQL

To implement a menu-driven CLI application

To apply object-oriented programming concepts

To perform CRUD operations using Java

To follow a layered architecture approach

3. Scope of the Project

This system is suitable for:

Small organizations

Academic mini-projects

Learning JDBC and database interaction

Understanding real-world Java application flow

The project can be extended in the future to include:

Login authentication

Role-based access (Admin/User)

GUI using JavaFX or Swing

Web version using Spring Boot

4. Technologies Used
Technology	Description
Java	Core Java (JDK 8+)
JDBC	Java Database Connectivity
MySQL	Relational Database
IDE	Eclipse / IntelliJ / VS Code
OS	Windows / Linux
5. System Architecture

The project follows a layered architecture:

Layers Used:

DTO (Data Transfer Object)

DAO (Data Access Object – Interface)

DAO Implementation (JDBC Logic)

Service Layer (Business Logic)

Main Layer (CLI / User Interaction)

Architecture Diagram (Logical)
User (CLI)
   ↓
Main Layer
   ↓
Service Layer
   ↓
DAO Interface
   ↓
DAO Implementation
   ↓
MySQL Database

6. Project Modules Description
6.1 EmployeeDTO (Data Transfer Object)

Represents employee data

Holds employee details such as:

Employee ID

Name

Department

Salary

Used to transfer data between layers

6.2 EmployeeDAO (Interface)

Declares database operations

Ensures abstraction between logic and database

Methods include:

addEmployee()

getAllEmployees()

getEmployeeById()

updateSalary()

deleteEmployee()

6.3 EmployeeDAOImpl (DAO Implementation)

Contains JDBC code

Establishes database connection

Executes SQL queries

Handles:

Insert

Select

Update

Delete operations

6.4 EmployeeService (Service Layer)

Contains business logic

Acts as a bridge between Main and DAO

Validates and processes data before database access

6.5 EmployeeMain (Main Layer)

Entry point of the application

Displays CLI menu

Accepts user input

Calls service methods

7. Database Design
7.1 Database Name
employeedb

7.2 Table Structure
Employee Table
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

Table Description
Column	Data Type	Description
emp_id	INT	Unique employee ID
name	VARCHAR	Employee name
department	VARCHAR	Department name
salary	DOUBLE	Employee salary
8. Functional Requirements

Add new employee

View all employees

Search employee by ID

Update employee salary

Delete employee record

Exit application

9. Non-Functional Requirements

Simple CLI interface

Fast response time

Reliable database connectivity

Easy to maintain code

Platform independent

10. Menu Flow
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee Salary
5. Delete Employee
6. Exit

11. Sample Output
1.Add 2.View 3.Search 4.Update Salary 5.Delete 6.Exit
Choose: 1
ID: 101
Name: Rahul
Department: IT
Salary: 50000
Employee added successfully

12. Error Handling

Invalid employee ID handling

Database connection error handling

Employee not found messages

Insufficient input handling

13. Limitations

No authentication system

No GUI (CLI only)

No data encryption

Single-user access

14. Future Enhancements

Login & authentication

Role-based access control

GUI using JavaFX

Web application using Spring Boot

Cloud database integration

Logging and reporting features

15. Conclusion

The Employee Management System successfully demonstrates how to build a menu-driven Java application using Core Java, JDBC, and MySQL.
It helps in understanding database connectivity, layered architecture, and CRUD operations, making it ideal for academic and learning purposes.

16. References

Java Documentation

MySQL Documentation

JDBC API Reference

17. Author Details

Name: Your Name
Project Type: Mini Project
Technology: Core Java, JDBC, MySQL
