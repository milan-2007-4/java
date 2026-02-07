class animal
{
    void eat()
    {
        System.out.println("animal eats");
    }
}

class dog extends animal
{
    void bark()
    {
        System.out.println("dog barks");
    }

    public static void main(String[] args)
    {
        dog d = new dog();
        d.eat();     // inherited method
        d.bark();  // child method
    }
}
