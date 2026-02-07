//example of java if statement 
class javaif
{
	public static void main(String[] args)
	{
		String name[]={"abc","xyz","pqr"};
		int roll[]={1,2,3};
		if(name[0]=="abc" && roll[0]==1)
		{
			System.out.println("info of abc");
		}
		else if(name[1]=="pqr" && roll[1]==2)
		{
			System.out.println("info of xyz");
		}
		else if(name[2]=="xyz" && roll[2]==3)
		{
			System.out.println("info of pqr");
		}
	}
}