class Area
{
    public static void main(String[] args)
    {
        // Command line arguments
        double radius = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);
        double breadth = Double.parseDouble(args[2]);

        // Calculations
        double circleArea = 3.14159 * radius * radius;
        double rectangleArea = length * breadth;

        // Output
        System.out.println("Radius of Circle = " + radius);
        System.out.println("Area of Circle = " + circleArea);

        System.out.println("Length of Rectangle = " + length);
        System.out.println("Breadth of Rectangle = " + breadth);
        System.out.println("Area of Rectangle = " + rectangleArea);
    }
}
