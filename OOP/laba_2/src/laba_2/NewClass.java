package laba_2;
import java.util.*;

public class NewClass
{
    int[]a;
    NewClass(int n)
    {
        a = new int[n];
        Random r = new Random();
        for(int i = 0;i<a.length;i++)
            a[i] = r.nextInt(50);
    }
    
    void print()
    {
        System.out.print("Mass: ");
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        
    }
    
    int sum()
    {
        int s = 0;
        for(int i = 0;i<a.length;i++)
            s+=a[i];
        return s;
    }
    
    int simm()
    {
        int i, j, k = 0;
        for(i = 0, j = a.length - 1;i < (a.length / 2);i++,j--)
            if(a[i] == a[j])
                k++;
        if(k == (a.length/2))
            return 1;
        else return 0;
    }
    
    NewClass(int[]a)
    {
        this.a = a;
    }
    
    public int sumPrimeAfter() 
    {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) 
        {
            if (func.prost(a[i])) 
            {
                if (a[i+1] % 2 == 0) 
                {
                    temp+=a[i];
                }
            }
        }
        return temp;
    }
    
    public int ksov()
    {
        int k = 0;
        for(int i = 0;i < a.length;i++)
        {
            if(func.sov(a[i]) == true)
                k++;
        }
        return k;
    }
    
    boolean vozr()
    {
        boolean sorted = true;
        for(int i = 0;i < a.length;i++)
        {
            if(a[i] < a[i+1]) sorted = false;
            break;
        }
        if (sorted) return true;
        else return false;
    }
    
    void sortpuz()
    {
        boolean sorted = false;
        int temp;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0;i < a.length;i++)
            {
                if(a[i] > a[i+1])
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
