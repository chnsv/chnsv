package laba_4;
import java.util.*;

public class Laba_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p1 = ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        Point p1 = new Point(a1,b1);
        
        //Point p4 = new Point(3,5);
        //System.out.println("Расстояние 1 = " + p1.dist(p4));
       // System.out.println("Расстояние 2 = " + p1.dist(3,4));
        
        System.out.println("Enter p2: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        Point p2 = new Point(a1,b1);
        
        System.out.println("Enter p3: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        Point p3 = new Point (a1,b1);
        
        Triangle t = new Triangle(p1,p2,p3);
        System.out.println("Dlina A: " + t.A());
        System.out.println("Dlina B: " + t.B());
        System.out.println("Dlina C: " + t.C());

        double p=t.Per();
        System.out.println("Perimetr = " + p);
        double pl = t.plosh();
        System.out.println("Ploshad = " + pl);
        
    }   
}
