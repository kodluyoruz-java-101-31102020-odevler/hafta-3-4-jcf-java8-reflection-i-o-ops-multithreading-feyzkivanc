package soru3.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		     Scanner scan = new Scanner(System.in);
		
			System.out.println("enter a student number");
			int studentNumber = scan.nextInt();
			System.out.println("enter a student name");
			String studentName = scan.next();
			System.out.println("enter a department");
			String department =scan.next();
			System.out.println("enter a student age");
			int age = scan.nextInt();
			
			
			Map<Integer, Student> student = new HashMap<>();

			student.put(studentNumber, new Student(studentNumber, studentName, age, department));

		
		System.out.println(student);
		
		scan.close();
	}
	
}
