package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

  

public class Main1 {

	public static void main(String[] args) throws IOException {
		
		 int id=0;
		Scanner sc=new Scanner(System.in);
        String co,cn,ca,cco,ce,cp,cpr,nm,ac,y;
		int op2;
		int r=0,rid=2000;
		View re[]=new View[20];
		
	    do
	    {
			System.out.println("\n\tMENU\n\n1.Registration\n2.View Registration\n3.Exit\n");
			op2=sc.nextInt();
	
		switch(op2)
		{
		
		case 1:            do
							{
							System.out.println("REGISTRATION");
							sc.nextLine();
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
						    re[r]=new View();
						   re[r].registration(rid,cn,ca,cco,ce,cp);
						    rid++;
						    r++;
						    System.out.println("Thank you for registering your ID is "+ rid);
						    System.out.println("Do you want to continue registration? (y/n)");
							co=sc.nextLine();
							}
							while(co.contentEquals("y"));
								break;
		
								
		case 2:            
							System.out.println("\t\tCUSTOMER LIST\n"); 
							System.out.println("The registered customers are");
							System.out.println("\nCUSTOMER ID\t\tCUSTOMER NAME");
							System.out.println("--------------------------------------\n");
							for(int i=0;i<r;i++)
							{
							re[i].view();
							}
							System.out.println("\nTHANK U\n");
							break;
		
		case 3:            System.exit(0);
		
		default:            System.out.println("Invalid");
							break;
							
		}
		}while(true);
		
	}
}
		
		
		
		
		
		
		
		
		
		

	