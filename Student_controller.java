package com.sms.controller;

import com.sms.service.*;
import java.util.Scanner;

public class Student_controller {
	
	StudentService service=new StudentService();
	Scanner ref=new Scanner(System.in);
	
	public void StartApp() {
		while(true) {
			System.out.println("\n===StudentManagementSystem===\n");
			System.out.println("1.AddStudent");
			System.out.println("2.ViewStudent");
			System.out.println("3.SearchStudent");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice");
			int choice=ref.nextInt();
			
			switch(choice) {
			case 1:
				AddStudent();
				break;
			case 2:
				ViewStudent();
				break;
			case 3:
				SearchStudent();
				break;
			case 4:
				System.out.println("Thank You");
				return;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
	public void AddStudent() {
		System.out.println("Enter Id");
		int Id=ref.nextInt();
		ref.nextLine();
		System.out.println("Enter Name");
		String Name=ref.nextLine();
		System.out.println("Enetr department");
		String Department=ref.nextLine();
		System.out.println("Enter Email");
		String Email=ref.nextLine();
		System.out.println("Enter PhoneNumber");
		long Number=ref.nextLong();
		
		Student student=new Student(Id,Name,Department,Email,Number;)
		boolean result=service.addStudent(student);
		if(result) {
			System.out.println("student added successfully");
		}
		
	}
}
