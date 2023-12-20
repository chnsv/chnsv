package laba_6;
import java.util.*;

public class Laba_6 
{
    public static void main(String[] args) 
    {
        Body[]b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count = ");
        int k = sc.nextInt();
        b = new Body[k];
        for(int i = 0;i<k;i++)
        {
            System.out.println("1-shar; 2-paralelogram");
            int p = sc.nextInt();
            if(p==1)
            {
                System.out.println("Enter r = ");
                double r = sc.nextDouble();
                Shar shar = new Shar(r);
                b[i] = shar;
            }
            if(p==2)
            {
                System.out.println("Enter 3 storoni: ");
                double a = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c = sc.nextDouble();
                Paral paral = new Paral(a,b1,c);
                b[i] = paral;
            }
        }
        for(int i = 0;i<k;i++)
        {
            b[i].print();
            System.out.println("S = " + b[i].S() + " " + "V = " + b[i].V());
        }
    } 
}
