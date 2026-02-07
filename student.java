//toString function in java
class student
{
	String name="sumt";
	int age=19;
	
	public String toString()
	{
		return "student{name="+name+",age="+age+"}";
	}
	
	public static void main(String[] args)
	{
		student s=new student();
		System.out.println(s.toString());
	}
}