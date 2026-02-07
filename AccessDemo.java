class AccessDemo
{
    public int a = 10;
    protected int b = 20;
    int c = 30;          // default
    private int d = 40;
	void show()
    {
        System.out.println(a); // public
        System.out.println(b); // protected
        System.out.println(c); // default
        System.out.println(d); // private (accessible here)
    }
    public static void main(String[] args)
    {
        AccessDemo obj = new AccessDemo();
		obj.show();
        
    }
}
