class VarArgsDemo
{
    static void add(int... n)
    {
        int total = 0;
        for (int i : n)
        {
            total = total + i;
        }
        System.out.println("total = " + total);
    }

    public static void main(String[] args)
    {
		VarArgsDemo v=new VarArgsDemo();
        v.add(10);            // one argument
        v.add(10,20);    // multiple arguments
    }
}
