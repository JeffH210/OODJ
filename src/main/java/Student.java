import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Student extends School {
    
    private String TpNum;
    private String programme;
    
    public Student (String name, String TpNum, String emailAddress, String contactNum, String programme){
        super(name,emailAddress,"default",contactNum);
        this.TpNum = TpNum;
        this.programme = programme;
    }
    
    
    public String getTpNum(){
        return TpNum;
    }
    
    public void setTpNum(String TpNum){
        this.TpNum = TpNum;
    }
    
    
    public String getProgramme(){
        return programme;
    }
    
    public void setProgramme(String programme){
        this.programme = programme;
    }
    
    public void writeToFile(String studentTxt ){
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))){
            writer.write("Name: " +getName()+"\n");
            writer.write("TP Number: " +getTpNum()+ "\n");
            writer.write("Email Address: " +getEmailAddress()+ "\n");
            writer.write("Contact Number: " +getContactNum()+ "\n");
            writer.write("Programme Name: " +getProgramme()+ "\n");
            writer.write("\n");
            System.out.println("Student profile has been updated: " + studentTxt);
        } catch (IOException e){
            System.out.println("Error to write the student text file " + e.getMessage());
        }
            
        
    }
}



   