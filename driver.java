//constructor inheritance first example
class A
{
	A()
	{
		System.out.println("class A's constructor is invoked");
	}
}
class B extends A
{
	B()
	{
		System.out.println("class B's constructor is invoked");
	}
}
class driver
{
	public static void main(String[] args )
	{
		A obj=new A();
	}
}