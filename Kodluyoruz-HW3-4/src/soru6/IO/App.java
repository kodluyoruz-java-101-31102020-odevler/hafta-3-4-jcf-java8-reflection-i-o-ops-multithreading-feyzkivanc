package soru6.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.crypto.URIReferenceException;

public class App{
public static void main(String[] args) throws URIReferenceException,FileNotFoundException {
		

		System.out.print("enter your student number ");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.next();
		System.out.print("enter your name  ");
		String studentName = scanner.next();
		System.out.print("enter your age ");
		String studentAge = scanner.next();
		System.out.print("enter your department ");
		String department = scanner.next();

		File file = new File("C:\\Users\\Lenovo\\Desktop\\hw\\student.txt");
		Operations.write(file, studentNo+"-"+studentName +"-" +studentAge+"-"+department+"\n");
			
		String content = Operations.read(new FileInputStream(file));
		System.out.println(content);
}
}