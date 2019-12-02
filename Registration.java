package programs;

import java.util.Scanner;

public class Registration {
	
	
	
		 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int f;
			String co,cn,ca,cco,ce,cp,cpr,nm;
			Registration c=new Registration();
			Display d=new Display();
			do
			{
			System.out.println("registration\n");
			System.out.println("Enter name");
			 cn=sc.nextLine();
			System.out.println("Enter address");
			 ca=sc.nextLine();
			System.out.println("Contact Number");
			cco=sc.nextLine();
			System.out.println("Email_ID");
			 ce=sc.nextLine();
			System.out.println("Enter Proof Type");
		   cp=sc.nextLine();
			System.out.println("Enter Proof_ID");
		    cpr=sc.nextLine();
		
		    
		    f=d.register(cn,ca,cco,ce,cp,cpr);
			}while(f==1);
			
			
			
		
			
		}
		}
