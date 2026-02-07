//example of encapsulation 
class area
{
	int length;
	int breath;
	void getdata()
	{
		int a=length*breath;
		System.out.println("rectangle area="+a);
	}
}
class Main
{
	public static void main(String[] args)
	{
		area obj=new area();
		obj.length=10;
		obj.breath=20;
		obj.getdata();
	}
}