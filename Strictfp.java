//strictfp keyword in java
class Strictfp
{
	public strictfp double sum()
	{
		double num1=10e+10;
		double num2=6e+02;
		return (num1+num2);
	}
	public static void main(String[] args)
	{
		Strictfp s=new Strictfp();
		System.out.println(s.sum());
	}
}