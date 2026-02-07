//private access specifier 
class person
{
	private String name;
	public void set_name(String name)
	{
		this.name=name;
	}
	public String get_name()
	{
		return name;
	}
}
class privateSpecifier
{
	public static void main(String[] args)
	{
		person p=new person();
		p.set_name("sumit");
		System.out.println(p.get_name());
	}
}