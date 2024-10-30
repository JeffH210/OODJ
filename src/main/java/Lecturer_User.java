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

public class Lecturer_User {
    public static void writeToFile(Scanner scanner,String lecturerLoginTxt){
         // Importing File Buffering Writing to write the lecturer login information to the text file
         try(BufferedWriter writer = new BufferedWriter(new FileWriter("lecturerLogin.txt", true))){
          System.out.println("Lecturer User System:");
          // User Input the Lecturer Username
          System.out.print("Enter Lecturer Username: ");
          String username = scanner.nextLine();
          System.out.print("Enter Lecturer Password: ");
          // User Input the Lecturer Password
          String password = scanner.nextLine();
          writer.write(username + "\t" + password + "\n" );
          // Print the message that lecturer username and password have been written to the text file
          System.out.println("Lecturer username and password have been written to the text file " +lecturerLoginTxt);
          } catch (IOException e){
              // error handling if it cannot write the lecturer login information to the text file
              System.out.println("Error to write the lecturer login text file " + e.getMessage());
          }
         }
    public static void main(String[]args){
        // import scanner for user inputing
        try(Scanner scanner = new Scanner(System.in)){
            // write the user that inputing to the text file
            writeToFile(scanner, "lecturerLogin.txt");
        } catch (Exception e){
          // error handling if error occurs
          System.err.println("Error: " + e.getMessage());
        }
    }
 }