class Room
{
	int length, width;
	void setdata(int l , int w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		System.out.println("area of room="+(length*width));
	}
	public static void main(String [] args)
	{
		Room r=new Room();
		r.setdata(10,20);
		r.area();
	}
}