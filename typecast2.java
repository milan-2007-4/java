//narrowing type casting, explicit type casting, manually type casting
class typecast2
{
	public static void main(String[] args)
	{
		double i=100.245;
		int k=(int)i;
		String str=String.valueOf(k);
		System.out.println("orginal value before casting:"+i);
		System.out.println("after type casting to int:"+k);
		System.out.println("after type casting to string:"+str);
		//valueOf(k); this is use to convert number into string
	}
}