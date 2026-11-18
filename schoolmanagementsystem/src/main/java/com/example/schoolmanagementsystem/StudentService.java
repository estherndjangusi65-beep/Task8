package com.example.schoolmanagementsystem;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public void showStudent() {
        System.out.println("Displaying student details...");
        repository.displayStudent();
        System.out.println("Student information displayed successfully.");
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the School Management System!");
    }


}