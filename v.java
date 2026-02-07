//example of Instance Initialization Block 
public class v
{
	{
		System.out.println("IIB block");
	}
	public v()
	{
		System.out.println("constractor block");
	}
	public static void main(String[] args)
	{
		v obj1=new v();
		v obj2=new v();
	}
}