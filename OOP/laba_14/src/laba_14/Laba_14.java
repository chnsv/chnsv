package laba_14;
import java.util.*;

public class Laba_14 {
    public static void main(String[] args) {
        MyList l = new MyList();
        l.createlist();
        System.out.println("List: ");
        l.print();
        System.out.println();
        System.out.println("List reverse: ");
        l.print_reverse();
        l.del("111");
        System.out.println("list: ");
        l.print();
        System.out.println("Simmetryc: " + l.simm());
        System.out.println("Delate first end: ");
        l.delEnd("222");
        l.print();
        System.out.println("Dublirovanie: ");
        l.dubl();
        System.out.println("Dobavlenie: ");
        l.dobavl();
    }    
}
