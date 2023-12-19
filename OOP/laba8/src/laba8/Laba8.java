package laba8;
import java.util.*;

public class Laba8 {
    public static void main(String[] args) {
        Body [] f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entter count el: ");
        int k = sc.nextInt();
        f = new Body[k];
        for(int i = 0;i<k;i++){
            System.out.println("1 - shar, 2 - paralelogram");
            int p = sc.nextInt();
            if(p==1){
                System.out.println("Enter r: ");
                double r = sc.nextDouble();
                Shar shar = new Shar(r);
                f[i] = shar;
            }
            if(p==2){
                System.out.println("Enter 3 storoni: ");
                double a = sc.nextDouble();
                double b1 = sc.nextDouble();
                double c = sc.nextDouble();
                Paral paral = new Paral(a,b1,c);
                f[i]=paral;
            }
        }
        for(int i = 0;i<k;i++){
            f[i].print();
            System.out.println("S = " + f[i].S()+" "+"V= "+f[i].V());
        }    
    } 
}
