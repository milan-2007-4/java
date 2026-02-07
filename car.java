class car
{
	String name;
	int speed;
	void getdata(String n , int s)
	{
		name=n;
		speed=s;
	}
	void display()
	{
		System.out.println("car name="+name);
		System.out.println("speed="+speed);
	}
	public static void main(String [] args)
	{
		car c=new car();
		c.getdata("BMW",180);
		c.display();
	}
}