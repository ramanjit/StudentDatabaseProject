package com.studentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseApp {
	
public static void main(String[] args)
{
	
	
	//Ask how many new students, we want to add in database
	System.out.println("Enter the number of new students to enroll : ");
	Scanner sc = new Scanner(System.in);
	int numOfStudents = sc.nextInt();
	Student[] students = new Student[numOfStudents];
	
	//Create number of new students
	for(int i = 0 ; i < numOfStudents ; i ++)
	{
		
		Student s1 = new Student();
		System.out.println();
		s1.selectOption();
	}
	
}

}
