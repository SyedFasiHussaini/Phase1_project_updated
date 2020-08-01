package Phase1_Project;
import java.io.File;
import java.util.*;

class Methods extends FilesMain {
	 		void Method1()
	 		{
			System.out.println("Select an option\n\n \t a. Add file \n\n \t b. Delete file \n\n \t c. Search file \n\n \t d. Back ");
			String ch;
			Scanner sc= new Scanner(System.in);
			ch=sc.next();
switch(ch) 
			{
			
			case "a": {
				CreateFile cf=new CreateFile();
			
				     // cf.addFiles();
			}	
				break;
				
			case "b": { DeleteFile df=new DeleteFile();
	          // df.delete();
				       
			}
				break;
				
			case "c": {
				SearchFile sf=new SearchFile();
		          // sf.searching();
				
			}
				break;
				
			case "d":	Method2();
						System.out.flush(); System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						main(null);
				break;
			
			default: System.out.println("You have not selected from the options provided, Please select proper option to continue.. ");
					
				break;
			}
		}

		void Method2()
		{
			System.out.println("\nDeveloper: Syed Fasiullah Hussaini.\nEmail-ID:sdfasiullah924@gmail.com");
			System.out.println("\n\n\n\n");
			System.out.println("******************************************************************Welcome to Lockers Pvt. Ltd.*********************************************************************************");
			System.out.println("\n********************************************************************Welcome to LockedMe.com************************************************************************************");
			System.out.println("\n\n\n\t##Select below any one option:\n\n");
			System.out.println(" \t  1. File names in Ascending order \n\n \t  2. Edit Files \n\n  \t  3. Exit Application ");
		}
}

public class FilesMain
{
public static void main(String[] args) 
{
	byte opt;
	Methods m= new Methods();
	//while(true) 
	{	//CreateFile cf=new CreateFile();// Need not to create method as I'm using constructors.
	//SearchFile sf=new SearchFile();
	//DeleteFile df=new DeleteFile();
	m.Method2();
	Scanner sc=new Scanner(System.in); //Input from the end-user.
	opt=sc.nextByte();
	switch(opt)
	{
		case 1: System.out.println("You have opted to Retrieve File names in Ascending order");
					Ascending1 af= new Ascending1();
			break;
			
		case 2: { 
			System.out.println("You have opted to Edit Files");
					m.Method1();
					}
			break;
			
		case 3: 	System.exit(opt);
			        //System.out.println("Are you sure that you want to exit?");
					//System.out.println("Press 1 for Yes\nPress any key for No");
			     	//	{ byte a = 0;
				    //	if(a==1)
				    //	}
					
			break;
			
		default:  System.out.println("You have not selected from the options provided, Please select proper option to continue.. ");
				
			break;	
}

	
}//while
}}



//Generic features and three operations: 

//Retrieving the file names in an ascending order
//
//Business-level operations:
//
//Option to add a user specified file to the application
//
//Option to delete a user specified file from the application
//
//Option to search a user specified file from the application
//
//Navigation option to close the current execution context and return to the main context
//
//Option to close the application