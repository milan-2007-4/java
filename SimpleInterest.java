import java.util.Scanner;

class SimpleInterest
{
    public static void main(String[] args)
    {
        double p, r, t, si;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        t = sc.nextDouble();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
