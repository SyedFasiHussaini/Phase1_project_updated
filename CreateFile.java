package Phase1_Project;
import java.io.*;
import java.util.Scanner;

class CreateFile extends Methods
{
	CreateFile() {
		String c,ch, d; 
		System.out.println("enter file name to create");
		Scanner s= new Scanner(System.in);
		ch=s.next();
		File file = new File("C:\\Users\\shussaini7\\OneDrive - DXC Production\\Desktop\\Hussaini7\\"+ch);
		boolean status;
		try {
			status = file.createNewFile();
		if(status)
			System.out.println("File has been created Sucessfully...");
		else	
			System.out.println("File already exists");
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		Method1();
	}
	
}

