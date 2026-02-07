//protected access specifier 
class vehicle
{
	protected int speed;
}
class bike extends vehicle
{
	public void set_speed(int s)
	{
		speed=s;
	}
	public int get_speed()
	{
		return speed;
	}
	public static void main(String[] args)
	{
		bike b=new bike();
		b.set_speed(100);
		System.out.println(b.get_speed());
		vehicle v=new vehicle();
		System.out.println(v.speed);
	}
}