//static key word in java
class helper
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}
class Static
{
	public static void main(String[] args)
	{
		int n=3,m=6;
		int s=helper.sum(n,m);
		System.out.println("sum is="+s);
	}
}