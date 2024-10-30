/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author dongk
 */
public class ProjectManager extends School {
    private String name;
    private String Status;
    
    public ProjectManager(String name, String Status){
        this.name = name;
        this.Status = Status;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }
    
        public void writeToFile(String ProjectManagerStatusTxt ){
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("project manager status.txt", true))){
            writer.write("Name: " +getName()+"\n");
            writer.write("Status: "+getStatus()+"\n");
            writer.write("\n");
            System.out.println("Project Manager Status has been updated: " + ProjectManagerStatusTxt);
        } catch (IOException e){
            System.out.println("Error to write the project manager status file " + e.getMessage());
        }   
    }
}
