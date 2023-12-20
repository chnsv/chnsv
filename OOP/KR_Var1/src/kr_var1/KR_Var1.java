package kr_var1;
import java.util.*;

public class KR_Var1 {
    public static void main(String[] args) {
        MyList l = new MyList();
        l.createlist();
        System.out.println("List: ");
        l.print();
        System.out.println();
                
        l.del();
        System.out.println("list: ");
        l.print();
        
        System.out.println("Simmetryc: " + l.simm());
    }
}
