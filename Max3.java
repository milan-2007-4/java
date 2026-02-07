import java.util.Scanner;

class Max3
{
    public static void main(String[] args)
    {
        int[] a ={5,8,9,7,4,10,6,1,2,3};
        java.util.Arrays.sort(a);
        
        System.out.println("Max1 = " + a[9]);
        System.out.println("Max2 = " + a[8]);
        System.out.println("Max3 = " + a[7]);
    }
}
