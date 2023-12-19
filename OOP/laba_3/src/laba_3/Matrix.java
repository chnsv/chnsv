package laba_3;
import java.util.*;

public class Matrix 
{
    private int [][]a;
    Matrix(int n)
    {
        a = new int [n][n];
        Random r = new Random();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a[i][j] = r.nextInt(50);
            }
        }
    }
    
    void print()
    {
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a.length;j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public int sumprost() 
    {
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) 
        {
            for(int j = 0;j<a.length;j++)
            {
                if(func.prost(a[i][j]))
                    if(i<j)
                        k += a[i][j];
            }
        }
        return k;
    }
    
    int proiz(int k)
    {
        int p = 1;
        for(int i = 0; i<a.length;i++)
        {
            for(int j = 0; j < a.length;j++)
            {
                if(i > a.length - j + 1)
                {
                    if(a[i][j] > k)
                        p *= a[i][j];
                }
            }
        }
        return p;
    }
    
    public int proizv()
    {
        int p = 1;
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a.length;j++)
            {
                if(func.sov(a[i][j]) == true)
                    p *= a[i][j];
            }
        }
        return p;
    }
    
    public void zamen()
    {
        int k = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(func.sov(a[i][j])==true)
                {
                    k++;
                }
                if(k>2)
                {
                    for(int q = 0; q < a[i].length; q++)
                    {
                        if(a[i][q]%2==0){a[i][q]=0;}
                    }
                    break;
                }
            }
            k = 0;
        }
    }
}