//non static example
class add
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}
class nonstatic
{
	public static void main(String[] args)
	{
		int a=3,b=6;
		int n=add.sum(a,b);
		System.out.println("sum is="+n);
	}
}