//calculat the usd into inr 
import java.util.Scanner;
class calculator
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter indian=");
		double ind=scn.nextDouble();
		double usd=89.63;
		double total=ind*usd;
		System.out.println("value is = "+total);
		scn.close();
	}
}