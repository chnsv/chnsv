package laba_7;
import java.util.*;

public class Laba_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "windows-1251");
        System.out.println("Enter data for money: ");
        
        System.out.println("Enter rub: ");
        int rub = sc.nextInt();
        System.out.println("Enter kop: ");
        int k = sc.nextInt();
        
        Money m = new Money(rub, k);
        System.out.println("Data for Money");
        System.out.println(m.toString());
        
        //
        System.out.println("Enter data for money 2: ");
        
        System.out.println("Enter rubl: ");
        int rubl = sc.nextInt();
        System.out.println("Enter kop: ");
        int kop = sc.nextInt();
        
        Money m2 = new Money(rub, k);
        System.out.println("Data for Money");
        System.out.println(m.toString());
        Money msumm=m.s(m2);
        System.out.println(msumm.toString());
    }
}
