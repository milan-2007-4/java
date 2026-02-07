//nested inner class
class outer
{
	static int outer_x=10;
	int outer_y=20;
	private int outer_private=30;
	class innerclass
	{
		void display()
		{
			System.out.println("outer_x="+outer_x);
			System.out.println("outer_y="+outer_y);
			System.out.println("outer_private="+outer_private);
		}
	}
}
public class nestedclass1
{
	public static void main(String[] args)
	{
		outer outerobj=new outer();
		outer.innerclass innerobj=outerobj.new innerclass();
		innerobj.display();
	}
}