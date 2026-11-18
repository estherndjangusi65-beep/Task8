package com.example.schoolmanagementsystem;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    private final StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public void showStudent() {
        repository.displayStudent();
    }
}