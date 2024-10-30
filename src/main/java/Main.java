/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dongk
 */
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter lecturer profile:");
    System.out.print("Lecturer Name: ");
    String lecturerName = scanner.nextLine();
    System.out.print("Staff ID: ");
    String lecturerStaffId = scanner.nextLine();
    System.out.print("Email Address: ");
    String lecturerEmailAddress = scanner.nextLine();
    System.out.print("Contact Number: ");
    String lecturerContactNum = scanner.nextLine();
    System.out.print("Job Title: ");
    String lecturerJobTitle = scanner.nextLine();

        
    Lecturer lecturer = new Lecturer(lecturerName, lecturerStaffId, lecturerEmailAddress, lecturerContactNum, lecturerJobTitle);
    lecturer.writeToFile("lecturer.txt");
    
    System.out.println("\nEnter student profile:");
    System.out.print("Student Name: ");
    String studentName = scanner.nextLine();
    System.out.print("TP Number: ");
    String studentTpNum = scanner.nextLine();
    System.out.print("Email Address: ");
    String studentEmailAddress = scanner.nextLine();
    System.out.print("Contact Number: ");
    String studentContactNum = scanner.nextLine();
    System.out.print("Programme Name: ");
    String studentProgramme = scanner.nextLine();
    
    Student student = new Student(studentName, studentTpNum, studentEmailAddress, studentContactNum, studentProgramme);
    student.writeToFile("student.txt");
        
    scanner.close();
        
    }
}
