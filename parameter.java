//example of parameterised constuctor
class parameter
{
	String name;
	int i;
	parameter(String name,int i)
	{
		this.name=name;
		this.i=i;
	}
	void display()
	{
		System.out.println("name="+name+"\nid="+i);
	}
	public static void main(String[] args)
	{
		parameter B=new parameter("rock",78);
		B.display();
	}
}