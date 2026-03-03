class multi_cath
{
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
			int []arr=new int[3];
			arr[5]=10;
			System.out.println(a);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("problem arrey1");
		}
		catch(Exception s)
		{
			System.out.println("problem arithmetic arr");
		}
	}
}