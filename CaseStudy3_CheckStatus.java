package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Booking
{
	static int room=0;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	static int arr[]=new int[25];
	void book(String ac,String cot,String cable,String wifi,String laundry) throws IOException
	{
		int cost=0;
		String c;
		this.ac= ac;
		this.cot= cot;
		this.cable= cable;
		this.wifi= wifi;
		this.laundry= laundry;    
		do
		{
			cost=0;
			System.out.println("AC/non-AC(AC/nAC)");*/
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			ac=in.readLine();
			if(ac.equals("AC"))
			{
				cost=cost+1000;
			}
			else
			{
				cost=cost+750;
			}
			
			if(cot.equals("Single"))
			{
				cost=cost+0;
			}
			else
			{
				cost=cost+350;
			}
			if(cable.equals("C"))
			{
				cost=cost+50;
				cable="cable";
			}
			if(wifi.equals("W"))
			{
				cost=cost+200;
				wifi="wifi";
			}
			if(laundry.equals("L"))
			{
				cost=cost+100;
				laundry="laundry";
			}
			System.out.println("\nThe total charge is Rs." +cost);
			System.out.println("The services chosen are");
			System.out.println(cot+" cot "+ac+ " room");
			System.out.println(cable+" enabled");
			System.out.println(wifi+" enabled");
			System.out.println("with " + laundry+ " service");
			System.out.println("Do you want to proceed?(yes/no)");
			c=in.readLine();
		}
		while(c.equals("no"));
	System.out.println("Thank you for booking. Your room number is "+ ++room);
	arr[room-1]=1;
	}

	public int[] getNumArray()
	{
		return arr.clone();
	}
}








