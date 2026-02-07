//method overriding
class vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}
}
class bike extends vehicle
{
	void run()
	{
		System.out.println("bike is running");
	}
}
public class methodoverriding
{
	public static void main(String[] args)
	{
		vehicle v=new vehicle();
		v.run();
		bike obj=new bike();
		obj.run();
	}
}