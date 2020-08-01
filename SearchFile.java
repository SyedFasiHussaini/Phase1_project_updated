package Phase1_Project;
import java.io.*;
import java.util.Scanner;

public class SearchFile extends Methods {
//public static void main(String[] args) {
	SearchFile(){
Scanner scan = new Scanner(System.in);
String ch;
System.out.println("\nEnter file name to be searched\n");
ch=scan.next();	
File folder = new File("C:\\Users\\shussaini7\\OneDrive - DXC Production\\Desktop\\Hussaini7\\"+ch);

try {
if(folder.exists())
	
	System.out.println("File has been searched");

else System.out.println("File not found");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}	
 Method1();
	}
}


