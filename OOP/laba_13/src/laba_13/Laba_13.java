package laba_13;
import java.util.*;

public class Laba_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>list=new List<>();        
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter element: ");        
        for(int i=0;i<n;i++) {            
            list.add(sc.nextInt());        
        }
        list.print();
        System.out.println();
        System.out.println("Remove element: ");
        for(int i=0;i<n;i++) {
            list.remove(sc.nextInt());            
            list.print();
        }
    }
}
