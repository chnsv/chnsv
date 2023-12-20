package kr_var2;
import java.util.*;

public class MySet {
    TreeSet<Integer> set;
    MySet(TreeSet<Integer>set){
        this.set=set;
    }
    TreeSet<Integer> getSet(){
        return set;
    }
    void fillSet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements set:");
        int x = sc.nextInt();
        while(x!=0){
            set.add(x);
            x = sc.nextInt();
        }
    }
    void print(){
        Iterator it = set.iterator();
        System.out.println("My set: ");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
    }
    
    MySet simple(){
        TreeSet<Integer> set1 = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while(it.hasNext()){
            int d = 0;
            Integer x = (Integer)it.next();
            for(int i = 1;i<x;i++)
                if(x%i==0)
                    d+=i;
            if(d==x)
                it.remove();
        }
        return new MySet(set1);
    }
}