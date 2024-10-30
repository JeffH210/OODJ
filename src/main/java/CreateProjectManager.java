/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author dongk
 */
// This is a class for creating project manager status
public class CreateProjectManager {
    public static void main(String args[]){
    //Importing scanner for user to input lecturer name and their status
    Scanner scanner = new Scanner(System.in);
    // System will print the message and user needs to input the name and status with string.
    System.out.println("Enter project manager status:");
    System.out.print("Lecturer Name: ");
    String projectManagerName = scanner.nextLine();
    System.out.print("Status: ");
    String projectManagerStatus = scanner.nextLine();
    
    // It will write as a format with name and status and writen into project manager status text file
    ProjectManager projectManager = new ProjectManager(projectManagerName, projectManagerStatus);
    projectManager.writeToFile("project manager status.txt");
    
    }
}
