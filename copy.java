//java copy constructor
class javacopy
{
	String name;
	int id;
	javacopy(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	javacopy(javacopy obj2)
	{
		this.name=obj2.name;
		this.id=obj2.id;
	}
}
class copy
{
	public static void main(String[] args)
	{
		javacopy ob=new javacopy("sumit",68);
		System.out.println("name="+ob.name+"\nid="+ob.id);
		javacopy ob1=new javacopy(ob);
		System.out.println("copy constructor used second object");
		System.out.println("name="+ob1.name+"\nid="+ob1.id);
	} 
}