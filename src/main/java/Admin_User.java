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

// This is the class for creating an user for admin.
public class Admin_User {
    //writeTOFile based on the user input the admin username and password
    public static void writeToFile(Scanner scanner,String adminLoginTxt){
         // Import File Buffering Writer, it will create a text file and name as adminLogin.txt.
         try(BufferedWriter writer = new BufferedWriter(new FileWriter("adminLogin.txt", true))){
          // The System will show Admin User System
          System.out.println("Admin User System:");
          // The user will need to input the username and password for admin.
          System.out.print("Enter Admin Username: ");
          String username = scanner.nextLine();
          System.out.print("Enter Admin Password: ");
          String password = scanner.nextLine();
          // The File format will write as username space password.
          writer.write(username + "\t" + password + "\n" );
          // In the next line, after user finish inputing the system will print that the inputs have already input into the text file
          System.out.println("Admin username and password have been written to the text file " +adminLoginTxt);
          } catch (IOException e){
            // If the system cannot find and write the file, it will send a error message to the user.  
              System.out.println("Error to write the admin login text file " + e.getMessage());
          }
         }
    public static void main(String[]args){
        // Import scanner for user to input the username and password
        try(Scanner scanner = new Scanner(System.in)){
            // Write to the text file after user inputing
            writeToFile(scanner, "adminLogin.txt");
        } catch (Exception e){
          // Print an error message for cannot inputing the username and password 
          System.err.println("Error: " + e.getMessage());
        }
    }
 }
