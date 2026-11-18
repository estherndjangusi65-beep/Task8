package com.example.schoolmanagementsystem;
import org.springframework.stereotype.Repository;
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public void displayStudent() {
        System.out.println("Student Name: Mave Ndjangusi Olive");
        System.out.println("Registration Number: 25-1079-BIT-S");
        System.out.println("Course: Bachelor of Information Technology");
        System.out.println("Student Year: 2:1");
        System.out.println("University: IUEA");
    }
    public void displayStudentStatus() {
        System.out.println("Student Status: Registered");
    }
}