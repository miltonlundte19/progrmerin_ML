import javax.swing.*;


  
import java.io.FileOutputStream;  
import java.io.PrintStream;  
public class PrintStreamTest{    
 public static void main(String args[])throws Exception{    
   String a = JOptionPane.showInputDiallog("numer");
   FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");    
   PrintStream pout=new PrintStream(fout);    
   pout.println(a);    
   pout.println("Hello Java");    
   pout.println("Welcome to Java");    
   pout.close();    
   fout.close();    
  System.out.println("Success?");    
 }    
}




String[] words = {};
Random r = new Random();
int randomnumber = R.nextInt(words.length);
return woeds[randomnumber]

