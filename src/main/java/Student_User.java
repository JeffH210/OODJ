
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dongk
 */
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student_User {
    public static void writeToFile(Scanner scanner,String studentLoginTxt){
        
         try(BufferedWriter writer = new BufferedWriter(new FileWriter("studentLogin.txt", true))){
          System.out.println("Student User System:");
          System.out.print("Enter Student Username: ");
          String username = scanner.nextLine();
          System.out.print("Enter Student Password: ");
          String password = scanner.nextLine();
          writer.write(username + "\t" + password + "\n" );
          System.out.println("Student username and password have been written to the text file " +studentLoginTxt);
          } catch (IOException e){
              System.out.println("Error to write the student login text file " + e.getMessage());
          }
         }
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){
            writeToFile(scanner, "studentLogin.txt");
        } catch (Exception e){
          System.err.println("Error: " + e.getMessage());
        }
    }
 }
