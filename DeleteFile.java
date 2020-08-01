package Phase1_Project;
import java.io.*;
import java.util.Scanner;

class DeleteFile extends Methods{
	//public static void main(String[] args) throws IOException {
	DeleteFile(){
	System.out.println("enter file name to delete");
		Scanner s= new Scanner(System.in);
		String ch;
		ch=s.next();
		File file = new File("C:\\Users\\shussaini7\\OneDrive - DXC Production\\Desktop\\Hussaini7\\"+ch);
		boolean status;
		status = file.delete();
if(status)
		System.out.println("file deleted");
else
{
		
		System.out.println("Entered file is not found");
}
Method1();
}
}
