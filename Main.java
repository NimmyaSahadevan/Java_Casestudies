package programs;
import java.util.Scanner;
public class Main {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	
	 public Main(String name,String address,String contactNumber,String email,String proofType,String proofID)
	 {
	  this.name=name;
	  this.address=address;
	  this.contactNumber=contactNumber;
	  this.email=email;
	  this.proofType=proofType;
	  this.proofID=proofID;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String name=sc.nextLine();
		
		String address=sc.nextLine();
		
		String contactNumber=sc.nextLine();
		String email=sc.nextLine();
		String proofType=sc.nextLine();
		String proofID=sc.nextLine();
		Main c=new Main(name,address,contactNumber,email,proofType,proofID);
		c.Register(name,address,contactNumber,email,proofType,proofID);
		sc.close();

	}
void Register(String name,String address,String contactNumber,String email,String proofType,String proofID)
{
	int id=0;
	id++;
System.out.println("registration\n");
System.out.println("name\n"+name);
System.out.println("address\n"+address);
System.out.println("Contact Number\n"+contactNumber);
System.out.println("E-Mail ID\n"+email);
System.out.println("proof type\n"+proofType);
System.out.println("proof id\n"+proofID);
System.out.println("Thank you for registering your id is "+id);
}
}
