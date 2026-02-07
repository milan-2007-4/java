//default access specifier
class car
{
	String model;
}
class default
{
	public static void main(String[] args)
	{
		car c=new car();
		c.model="tesla";
		System.out.println(c.model);
	}
}