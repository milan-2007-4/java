//example of inheritance 
class car
{
	String name;
	public void speed()
	{
		System.out.println("speeding");
	}
}
class alto extends car
{
	public void display()
	{
		System.out.println("this is alto class of display method");
	}
}
class Main1
{
	public static void main(String[] args)
	{
		alto a=new alto();
		a.name="fortuner";
		a.display();
	}
}