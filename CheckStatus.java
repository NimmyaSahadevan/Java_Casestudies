package programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CheckStatus {
	
	
	void check(int id)
	{
		/*Scanner sc=new Scanner(System.in);
		 System.out.println("Check Status");			
	        System.out.println("Enter the room number");
	        int d=sc.nextInt();*/
		int f=id;
	Booking b = new Booking();
	int[] secondArray = b.getNumArray();
		
		if(b.arr[f-1]==1)
		{
			System.out.println("room  booked\n");
		}
		else//if(b.arr[f-1]==0)
		{
			System.out.println("room not booked\n");
		}
		
		
		
	}
	

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Booking b=new Booking();
		String ac="null";
		String cot="null";
		String cable="null";
		String wifi="null";
		String laundry="null";
	//	b.book(ac,cot,cable,wifi,laundry);
		CheckStatus obj=new CheckStatus();	
		Scanner sc=new Scanner(System.in);
		
		do
		{
		
		System.out.println("\nMenu\n1. Book\n2. Check Status\n3. Exit\nEnter your Choice");
		int n=sc.nextInt();
		
		
		switch(n)
		{
		case 1: System.out.println("Please choose the services required.");
		        System.out.println("AC/non-AC(AC/nAC)");
		        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		        ac=in.readLine();
			
			
		        System.out.println("Cot(Single/Double)");
		        cot=in.readLine();
			
		        System.out.println("With cable connection/without cable connection(C/nC)");
		        cable=in.readLine();
		        
		        
		        System.out.println("Wi-Fi needed or not(W/nW)");
		        wifi=in.readLine();
		        
		        System.out.println("Laundry service needed or not(L/nL)");
		        laundry=in.readLine();
		        System.out.println("Booking:");   
		        
			    b.book(ac,cot,cable,wifi,laundry);
			    break;
		
				
					
		
		case 2: //Scanner sc=new Scanner(System.in);
		        System.out.println("Check Status");			
	              System.out.println("Enter the room number");
	            int d=sc.nextInt();
		        obj.check(d);
		          break;
		
		case 3:
			System.exit(0);	
		        
		
		default : System.out.println("Invalid Input");
		}
		
		
		
		}while(true);	
		

	}

}
