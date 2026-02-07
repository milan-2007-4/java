//method overloading 
class  method
{
	String model;
	int year;
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
	public double multiply(int a,int b,double c, double d)
	{
		return a*b*c*d;
	}
	public static void main(String[] args)
	{
		method o1=new method();
		
		double ans=o1.multiply(10,20);
		System.out.println("product of the two number ="+ans);
		
		ans=o1.multiply(10,20,30 );
		System.out.println("product of the three number ="+ans);
		
		ans=o1.multiply(10,20,30.2,40.3);
		System.out.println("product of the three number ="+ans);
	} 
}