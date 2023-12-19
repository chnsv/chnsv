package laba_2;
import java.util.*;

public class Laba_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        NewClass m = new NewClass(n);
        m.print();
        
        int sum = m.sum();
        System.out.print("Summ mass = " + sum);
        
        System.out.println();
        
        int simm = m.simm();
        System.out.print("Simmetria: " + simm);
        
        System.out.println();

        System.out.print("Size next mass: ");
        int q = sc.nextInt();
        int[]b = new int[q];
        for(int i = 0;i<b.length;i++)
            b[i] = sc.nextInt();
        NewClass b2 = new NewClass(b);
        int s = m.sum();
        int s2 = b2.sum();
        if( s > s2) System.out.print("Summa m > b2");
        else System.out.print("Summa m < b2");
        
        System.out.println();
        
        int summa = m.sumPrimeAfter();
        System.out.print("Summ prost = " + summa);
        
        System.out.println();
        
        /*System.out.print("Mass: ");
        m.vozr();
        
        System.out.print("Mass in vozvr: ");
        m.sortpuz();*/
        
        System.out.println();
        
        int kolsov = m.ksov();
        System.out.print("Kol-vo sover = " + kolsov);
    }    
}