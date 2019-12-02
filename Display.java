package programs;
import java.util.Scanner;
public class Display {
	
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	 static int id=0;
	 String co,nm;
	 public void Display(String cn,String ca,String cco,String ce,String cp,String cpr)
	 {
	  this.name=cn;
	  this.address=ca;
	  this.contactNumber=cco;
	  this.email=ce;
	  this.proofType=cp;
	  this.proofID=cpr;
	
	 }
	  public int register(String cn,String ca,String cco,String ce,String cp,String cpr)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Thank you for registering your id is "+ ++id);
			System.out.println("do you want to continue registration(y/n)");
			co=sc.nextLine();
			if(co.equals("y"))
			{
				
					return 1;
				}
			else
			{
				System.out.println("do you want to change the email(y/n)");
				String ch=sc.nextLine();
				if(ch.equals("y"))
				{
					System.out.println("\nUpdate Mail");
					System.out.println("\nEnter new Email id");
				   nm=sc.nextLine();
					email=nm;
					System.out.println("Email updated");
				}	
			
			
			
			
		System.out.println("\nyour details are as follows:");
		System.out.println("\nName:"+cn);
		System.out.println("Address:"+ca);
		System.out.println("Contact Number:"+cco);
		System.out.println("E-Mail ID:"+email);
		System.out.println("Proof type:"+cp);
		System.out.println("Proof id:"+cpr);
	  
	  
	  }
	  
	  return 0;
	  }
	  
}
	  
	  
	  
	  
	  
	  
	  
	  
    