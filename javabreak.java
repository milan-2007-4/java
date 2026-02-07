//example of java break statemant 
class javabreak
{
	public static void main(String[] args)
	{
		for(int i=0;i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				if(i==1)
				{
					break;
				}
			}
		}
	}
}