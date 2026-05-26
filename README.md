# StudentCourseManagementSystem

A full-stack web application developed using Java, Spring Boot, Spring MVC, Spring Security, Hibernate, Thymeleaf, and MySQL to manage students, courses, and course registrations.

---

# Features

## Student Management
- Add Students
- View Students
- Delete Students

## Course Management
- Add Courses
- View Available Courses

## Course Registration
- Register Students to Courses
- View Registered Courses

## Authentication
- Secure Login using Spring Security
- Session-based Authentication

## Frontend Features
- Responsive UI using Bootstrap
- Dashboard Navigation
- Search Bar
- Sidebar
- Dynamic Data Rendering using Thymeleaf

---

# Technologies Used

## Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Spring Security

## Frontend
- HTML
- CSS
- JavaScript
- Bootstrap
- Thymeleaf

## Database
- MySQL

## Tools
- Maven
- Git
- GitHub
- IntelliJ IDEA

---

# Project Architecture

MVC Architecture was used in this project.

Browser
↓
Controller
↓
Service
↓
Repository
↓
MySQL Database

---

# Database Tables

- students
- courses
- student_course

The `student_course` table is used to maintain the Many-to-Many relationship between students and courses.

---

# Key Concepts Implemented

- MVC Architecture
- RESTful Routing
- CRUD Operations
- Database Integration
- Many-to-Many Mapping
- Authentication & Authorization
- Object-Oriented Programming
- Layered Architecture

---

# Screenshots

## Home Page
- Dashboard with navigation buttons

## Students Page
- Add/View/Delete students

## Courses Page
- Add/View available courses

## Register Course Page
- Assign courses to students

## Registered Courses Page
- View student-course registrations

---

# Challenges Faced

- Implementing Many-to-Many relationship using JPA
- Integrating Thymeleaf with Spring Boot
- Handling Spring Security authentication
- Managing dynamic frontend rendering

---

# Future Enhancements

- Update/Edit Student and Course Details
- Pagination and Sorting
- Search and Filter Functionality
- Role-Based Authentication (Admin/User)
- Email Notifications
- JWT Authentication
- REST API Documentation using Swagger
- Docker Deployment
- Cloud Deployment (AWS/Render/Railway)
- File Upload Feature
- Student Profile Images
- Course Completion Tracking

---

# Learning Outcomes

This project helped in understanding:
- Real-world backend architecture
- Spring Boot ecosystem
- Database relationships
- Authentication and security
- Full-stack application development

---

# Author

Mrudula Sai

GitHub:
https://github.com/mrudulasai3606

---
