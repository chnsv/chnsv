package laba_3;
import java.util.*;

public class Laba_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        Matrix a = new Matrix(n);
        a.print();
        
        int sum = a.sumprost();
        System.out.print("sum prost = " + sum);
        
        System.out.println();
        
        System.out.print("Func zamen");
        System.out.println();
        a.print();
        
        System.out.println();
        
        System.out.print("Enter number: ");
        int k = sc.nextInt();
        int pr = a.proiz(k);
        System.out.print("Proizv nize poboch = " + pr);
        
        System.out.println();
        
        int p = a.proizv();
        System.out.print("Proizv sov = " + p); //????
    }
}
