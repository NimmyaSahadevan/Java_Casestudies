package programs;

import java.util.Scanner;
public class bookrooms {
	static Scanner ob = new Scanner(System.in);
	public static void main(String [] arg)
	{
		int id;
		String name,address,mob,pt,pno,ac,cot,cable,wifi,laundry;
		int op2,date=0;
		int r=0,b=0,rid=2050,bid=2001,roomid=1;
		int d1,d2;
		Register re[]=new Register[20];
		booking1 bo[]=new booking1[20];
	
		String op;
		do
		{
			System.out.println("1.Booking\n2.View Booking\n3.Exit");
			op2 = ob.nextInt();
	switch(op2)
	{
	case 1:
		System.out.print("Registration ");
		//System.out.println("Enter personal details");
		System.out.println("Enter Name : ");
		ob.nextLine();
		name=ob.nextLine();
		System.out.println("Enter Address : ");
		address=ob.nextLine();
		System.out.println("Enter Mobile Number : ");
		mob=ob.nextLine();
		System.out.println("Enter ID-Proof Type : ");
		pt=ob.nextLine();
		System.out.println("Enter ID-Proof Number : ");
		pno=ob.nextLine();
		re[r]=new Register();
		int reid=re[r].registration(rid,name,address,mob,pt,pno);
		rid++;
		re[r].display();
		//System.out.println("Thank you for Registering, Your id is :"+reid);
		do
		{
			System.out.println("Please choose the services required\nAC/non-AC (AC/nAC) :");
			ac=ob.next();
			System.out.println("Cot(Single/Double) :");
			cot=ob.next();
			System.out.println("With cable connection/without cable connection(C/nC) :");
			cable=ob.next();
			System.out.println("Wi-Fi needed or not(W/nW) :");
			wifi=ob.next();
			System.out.println("Laundry service needed or not(L/nL) :");
			laundry=ob.next();
			System.out.println("Enter Booking date");
			date=ob.nextInt();
			bo[b]=new booking1();
			int bbid=bo[b].book(ac, cot, cable, wifi, laundry,date,roomid,reid);
			b++;
			roomid++;
			//System.out.println("Thank you for Booking Your Room Number is "+(bbid));
			System.out.println("Do you want to Book more Rooms(Yes/No):");
			op=ob.next();
		}while(op.equals("yes")||op.equals("Yes"));
			break;
	case 2:
		System.out.println("Enter Start Date:");
		d1=ob.nextInt();
		System.out.println("Enter End Date:");
		d2=ob.nextInt();
	//	System.out.println()
		System.out.println("            BOOKING DETAILS\n");
		System.out.println("Room NO\t\tCustomer id");
		for(int j=0;j<b;j++)
		{
		if((bo[j].date>=d1)&&(bo[j].date<=d2))
		{
			bo[j].view(d1,d2);
		}
		}
		break;
	case 3:
		System.exit(0);
}
System.out.println("Do you want to proceed?(yes/no)");
op=ob.next();
		}while(op.contentEquals("yes"));
		}
	}