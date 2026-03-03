class simpal_exction
{
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
			
			System.out.println(a);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("problem arrey1");
		}
		
	}
}