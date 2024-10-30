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

// This is a sub class from lecturer
public class Lecturer extends School {
    
    private String staffId;
    private String jobTitle;
    
    //Constructor for creating a lecturer object
    public Lecturer(String name, String staffId, String emailAddress, String contactNum, String jobTitle){
        super(name,emailAddress,"default",contactNum);
        this.staffId = staffId;
        this.jobTitle = jobTitle;
    }
    
    public String getStaffID(){
        return staffId;
    }
    
    public void setStaffID(String staffId){
        this.staffId = staffId;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    // Write lecturer information to lecturer text file
    public void writeToFile(String lecturerTxt ){
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("lecturer.txt", true))){
            writer.write("Name: " +getName()+"\n");
            writer.write("Staff ID: " +getStaffID()+ "\n");
            writer.write("Email Address: " +getEmailAddress()+ "\n");
            writer.write("Contact Number: " +getContactNum()+ "\n");
            writer.write("Job Title: " +getJobTitle()+ "\n");
            writer.write("\n");
            // System print message that lecturer profile has been updated
            System.out.println("Lecturer profile has been updated: " + lecturerTxt);
        } catch (IOException e){
            // error handling for showing the error message
            System.out.println("Error to write the lecturer text file " + e.getMessage());
        }
            
        
    }
}
