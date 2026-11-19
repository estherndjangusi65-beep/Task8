package com.example.schoolmanagementsystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolmanagementsystemApplication
		implements CommandLineRunner {
	private final StudentService studentService;
	public SchoolmanagementsystemApplication(StudentService studentService) {
		this.studentService = studentService;
	}
	public static void main(String[] args) {
		SpringApplication.run(
				SchoolmanagementsystemApplication.class, args);
	}
	@Override
	public void run(String... args) {
		System.out.println("SCHOOL MANAGEMENT SYSTEM");
		System.out.println("------------------------");
		studentService.showStudent();
	}
}