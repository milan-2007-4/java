//static nested class 
class outer
{
	static int outer_x=10;
	int outer_y=20;
	private static int outer_private=30;
	static class statinestedclass
	{
		void display()
		{
			System.out.println("outer_x="+outer_x);
			System.out.println("outer_private="+outer_private);
			outer out=new outer();
			System.out.println("outer_y="+out.outer_y);
		}
	}
}
public class nestedclass
{
	public static void main(String[] args)
	{
		outer.statinestedclass nestedobj=new outer.statinestedclass();
		nestedobj.display();
	}
}