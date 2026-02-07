class staticdemo
{
    static int a = 10;    
    int b = 20;         

    void show()
    {
        System.out.println("Static a = " + a);
        System.out.println("Non-static b = " + b);
    }

    public static void main(String[] args)
    {
        staticdemo s = new staticdemo();
        s.show();
    }
}
