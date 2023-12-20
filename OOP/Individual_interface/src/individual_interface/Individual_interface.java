package individual_interface;
import java.util.*;

public class Individual_interface {
    public static void main(String[] args) {
        Array [] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count massiva: ");
        int n = sc.nextInt();
       
        a = new Array[n];
        for(int i = 0;i<n;i++){
            System.out.println("1 - SortArray, 2 - HorArray");
            int p = sc.nextInt();
            if(p==1){
                System.out.println("Enter size massiva : ");
                int k = sc.nextInt();
                int []x = new int [k];
                System.out.println("Enter massiv: ");
                for(int j = 0;j<x.length;j++){
                    x[j] = sc.nextInt();
                }
                SortArray sortarray = new SortArray(x);
                a[i] = sortarray;
            }
            if(p==2){
                System.out.println("Enter size massiva : ");
                int k = sc.nextInt();
                int []x = new int [k];
                System.out.println("Enter massiv: ");
                for(int j = 0;j<x.length;j++){
                    x[j] = sc.nextInt();
                }
                XorArray xorarray = new XorArray(x);
                a[i] = xorarray;
            }
        }
        for(int i = 0;i<n;i++){
            a[i].print();
            System.out.println("Slogenie: ");
            a[i].S(a);
            System.out.println("Obrabotka: ");
            a[i].O();
            System.out.println();
        }
    }       
}
