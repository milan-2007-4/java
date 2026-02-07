//shallow cloning 
class abc
{
	int i,j;
	public String toString()
	{
		return "abc i=="+i+"abc j=="+j;
	}
}
class clone
{
	public static void main(String[] args)
	{
		abc a=new abc();//reference
		a.i=5;
		a.j=6;
		abc a1=a;
		a1.j=9;
		System.out.println(a);
		System.out.println(a1);
	}
}