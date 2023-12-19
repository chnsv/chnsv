package com.mycompany.laba_1;
import java.util.*;

public class Laba_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Input A: ");
        int a = sc.nextInt();
        System.out.println("Input B: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum = " + c); */

/*Задание массива:*/
        /*System.out.println("Input n: ");
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("Input mas: ");
        for(int i = 0;i<a.length;i++)
            a[i] = sc.nextInt();
        int s = 0;
        for(int i = 0;i < a.length;i++)
            s += a[i];
        System.out.println("Sum = " + s);*/

/*Кол-во простых*/
        /*System.out.println("Input n: ");
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("Input mas: ");
        for(int i = 0;i<a.length;i++)
            a[i] = sc.nextInt();
        int kol = 0;
        for(int i = 0;i < a.length; i++)
        {
            int k = 0;
            for(int d = 1; d <= a[i]; d++)
            {
                if(a[i] % d == 0) k++;
            }
            if(k == 2) kol++;
        }
        System.out.println("Kol-vo chisel = " + kol); */

/*Проверить, является ли он симметричным*/
        /*System.out.println("Input n: ");
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("Input mas: ");
        for(int i = 0;i<a.length;i++)
            a[i] = sc.nextInt();
        int i, j;
        int k = 0;
        for(i = 0, j = a.length - 1;i < (a.length / 2);i++,j--)
            if(a[i] == a[j])
                k++;
        if(k == (a.length/2))
            System.out.println("YES");
        else System.out.println("No");
        
 /*Если в массиве больше двух совершенных элементов, то четные заменить 0*/
        /*System.out.println("Input n: ");
        int n = sc.nextInt();
        int[]a = new int[n];
        System.out.println("Input mas: ");
        for(int i = 0;i<a.length;i++)
            a[i] = sc.nextInt();
        int k = 0;
        for(int i = 0;i<a.length;i++)
        {
            int s = 0;
            for(int d = 1;d<a[i];d++)
                if(a[i] % d == 0)
                    s +=d;
            if(a[i] == s) k++;
        }
        System.out.println("k = " + k);
        if(k > 2)
        {
            for(int i = 0;i<a.length;i++)
            {
                if(a[i] % 2 == 0)
                    a[i] = 0;
                System.out.println(a[i]);
            }
        }
        else System.out.println("Sovershennih menshe");*/
    }
}