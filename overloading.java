//constructor overloading 
class  overloading
{
	String model;
	int year;
	overloading()
	{
		model="alpha";
		year=2006;
	}
	overloading(int year)
	{
		this.model="beta";
		this.year=year;
	}
	overloading(int year,String model)
	{
		this.model=model;
		this.year=year;
	}
	void display()
	{
		System.out.println("year=="+year+"\nmodel="+model);
	}
	public static void main(String[] args)
	{
		overloading o1=new overloading();
		overloading o2=new overloading(2007);
		overloading o3=new overloading(2008,"game");
		o1.display();
		o2.display();
		o3.display();
	} 
}