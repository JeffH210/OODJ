/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dongk
 */

public class School {
    
    protected String name;
    protected String emailAddress;
    protected String country;
    protected String contactNum;
    
    public School(){
        this.name = "default";
        this.emailAddress = "default";
        this.country = "default";
        this.contactNum = "default";
    }
    
    public School(String name, String emailAddress, String country, String contactNum){
        this.name = name;
        this.emailAddress = emailAddress;
        this.country = country;
        this.contactNum = contactNum;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setContactNum(String contactNum){
        this.contactNum = contactNum;
    }
    
    public String getContactNum(){
        return contactNum;
    }
}
       
