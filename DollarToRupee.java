import java.util.Scanner;

class DollarToRupee
{
    public static void main(String[] args)
    {
        double dollar, rupee;
        double rate = 91.72 ;   // 1 USD = 83 INR (example rate)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in US Dollars: ");
        dollar = sc.nextDouble();

        rupee = dollar * rate;

        System.out.println("Amount in Indian Rupees = " + rupee);
    }
}
