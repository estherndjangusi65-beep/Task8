package com.example.schoolmanagementsystem;
import org.springframework.stereotype.Repository;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public void displayStudent() {
        System.out.println("Student Name: Mave");
        System.out.println("Course: Bachelor of Information Technology");
        System.out.println("University: IUEA");
    }
}