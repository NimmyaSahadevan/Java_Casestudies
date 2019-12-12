package programs;
import java.util.Scanner;

public class CaseStudy2_Main
{
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
		
	void bk(String ac,String cot,String cable,String wifi,String laundry) 
	{
			
		this.ac=ac;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;	
		System.out.println("Booking");
		String s5;
		int r=1;
		do
		{
			int c=0;
			System.out.println("Please choose the services required");
			System.out.println("AC/NonAC");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();	
			if(s.equals("AC"))	
			{
				c=c+1000;	
			}
			else
			{
				c=c+500;
			}
			System.out.println("Cot(single/double)");	
			String s1=sc.nextLine();
			if(s1.equals("single"))	
			{
				c=c+600;	
			}
			else
			{
				c=c+1200;
			}
			System.out.println("With cable connection/without cable connection(C/nC)");	
			String s2=sc.nextLine();
			if(s2.equals("C"))	
			{
				c=c+800;
				s2="cable";
			}
			else
			{
				c=c+500;
				s2=" No cable";
			}
			System.out.println("Wi-Fi needed or not(W/nW)");	
			String s3=sc.nextLine();
			if(s3.equals("W"))	
			{
				c=c+1100;	
		                s3="Wi-Fi";
			}
			else
			{
				c=c+700;
				s3=" No Wi-Fi";
			}
			System.out.println("Laundary service needed or not(L/nL))");	
			String s4=sc.nextLine();
			if(s4.equals("L"))	
			{
				c=c+1500;	
				s4="laundary";
			}
			else
			{
				c=c+1000;
				s4=" No laundary";
			}
			System.out.println("The total charge is Rs."+c);
			System.out.println("The services chosen are");
			System.out.println(s+" cot "+s1+" room ");
			System.out.println(s2+" enabled ");
			System.out.println(s3+" enabled ");
			System.out.println("with "+s4+" service ");
			System.out.println("DO YOU WANT TO PROCEED(Y/NO)");
			s5=sc.nextLine();
		}
		while(s5.equals("NO"));
		System.out.println("thank you for booking your room no is "+r);
		r++;
		} 
		 
	public static void main(String[] args) 
	{
        	CaseStudy2_Main b=new CaseStudy2_Main();
		String ac="";
		String cot="";
		String cable="";
		String wifi="";
		String laundry="";
		b.bk(ac,cot,cable,wifi,laundry);

	}

}


