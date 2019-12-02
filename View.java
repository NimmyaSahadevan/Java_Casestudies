package programs;
import java.util.Scanner;
public class View {
	int id;
	String cn,ca,cco,cp,cpr;
	public void registration(int id,String cn,String ca,String cco,String cp,String pcr)
	{
		this.id=id;
		this.cn=cn;
		this.ca=ca;
		this.cco=cco;
		this.cp=cp;
		this.cpr=cpr;
	}
	void view()
	{
		System.out.println(id+"\t\t\t"+cn);
		
	}
}
