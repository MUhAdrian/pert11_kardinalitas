
import java.awt.image.DataBuffer;

public class Check extends payment {
 private String name;
 private String bankID;
 
 public Check(String name,String bankID){
    this.name=name;
    this.bankID=bankID;
 }
public void autorized(String name,String bankID){
    this.name = name;
    this.bankID = bankID;
}
 public String getName(){
    return name;
 }
 public String getBankID(){
    return bankID;
 }
    
}
