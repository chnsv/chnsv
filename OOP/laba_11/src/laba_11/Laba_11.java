package laba_11;
import java.util.*;

public class Laba_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int d  = sc.nextInt();
        System.out.println("Enter month: ");
        int m  = sc.nextInt();
        System.out.println("Enter year: ");
        int y  = sc.nextInt();
        
        try{
            Data date = new Data(d,m,y);
            date.print();
            System.out.println(date.dayNum());
            date.addDays(3);
            date.print();
        }
        catch(MyExeption e){
            System.out.println(e.getMessage()+" "+e.getDate());
        }
    }
}
