class constructor
{
    constructor()
    {
        System.out.println("Default constructor");
    }

    constructor(int a)
    {
        System.out.println("Parameterized constructor: " + a);
    }

    public static void main(String[] args)
    {
        new constructor();
        new constructor(10);
    }
}
