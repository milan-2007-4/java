//constructor inheritance third example
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
class C extends B
{
	C()
	{
		System.out.println("class C's constructor is invoked");
	}
}
class driver2
{
	public static void main(String[] args )
	{
		C obj=new C();
	}
}