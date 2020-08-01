package Phase1_Project;
import java.io.File;
import java.util.*;

	public class Ascending1 extends Methods {
		
		Ascending1(){
			System.out.println("callllllleeeeeeeeeeeeeeeeeeeddddddddddddddddddddddddddd");

		//public static void main(String[] args) {
			File fileDir = new File("C:\\Users\\shussaini7\\OneDrive - DXC Production\\Desktop\\Hussaini7");
			if(fileDir.isDirectory()){
				//List listFile = Arrays.asList(fileDir.list());
				String[] files=fileDir.list();
				System.out.println("\n\nListing files in Ascending Order\n\n\n\n*****************************************");
				for(String s:files){
					System.out.println(s);
				}
			} 
main(null);
			//System.out.println("\n\n\n\t##Select below any one option:\n\n");
			//System.out.println(" \t  1. File names in Ascending order \n\n \t  2. Edit Files \n\n  \t  3. Exit Application ");
		}
	}