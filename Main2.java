//dot operator in java
class person
{
	String name;
	int age;
}
class Main2
{
	public static void main(String[] args)
	{
		person Person=new person();
		Person.name="jon";
		Person.age=30;
		System.out.println("name:"+Person.name);
		System.out.println("age:"+Person.age);
	}
}