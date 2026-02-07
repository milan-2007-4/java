//variable arguments
class varargs
{
	public static void name(String...n)
	{
		for (String i:n)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		name("hello","java");
		name("hello","ksc","collage");
	}
}