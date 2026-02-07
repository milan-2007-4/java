//example of java continue statement 
class javacontinue
{
	public static void main(String[] args)
	{
		for(int i=0;i<=20; i++)
		{
			if(i%2==0)
			{
				if(i==12)
				{
					System.out.println(i);
					continue;
				}
			}
		}
	}
}