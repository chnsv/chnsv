package kr_var2;
import java.util.*;

public class KR_Var2 {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<Integer>();
        MySet myset = new MySet(set);
        myset.fillSet();
        myset.print();
        MySet simple = myset.simple();
        System.out.println("New set: ");
        simple.print();
    }
}
