package laba_15;
import java.util.*;

public class Laba_15 {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<Integer>();
        MySet myset = new MySet(set);
        myset.fillSet();
        myset.print();
        MySet simple = myset.simple();
        System.out.println("New set: ");
        simple.print();
        TreeSet<Integer> s = new TreeSet<Integer>();
        MySet ms = new MySet(s);
        ms.fillSet();
        MySet union = myset.union(ms);
        System.out.println("Obedinenie: ");
        union.print();
        MySet notsimple = myset.notsimple();
        System.out.println("New set: ");
        notsimple.print();
        MySet peresech = myset.peresech(ms);
        System.out.println("Peresechenie: ");
        peresech.print();
        MySet razn = myset.razn(ms);
        System.out.println("Raznost: ");
        razn.print();
    }
    
}
