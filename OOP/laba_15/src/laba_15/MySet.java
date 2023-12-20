package laba_15;
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
            int k = 0;
            Integer x = (Integer)it.next();
            for(int i = 1;i<=x;i++)
                if(x%i==0)
                    k++;
            if(k==2)
                it.remove();
        }
        return new MySet(set1);
    }
    MySet union(MySet a){
        TreeSet<Integer> set1 = a.getSet();
        TreeSet<Integer> res = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while(it.hasNext())
            res.add((Integer)it.next());
        return new MySet(res);
    }
    MySet notsimple(){
        TreeSet<Integer> set1 = new TreeSet<Integer>(set);
        Iterator it = set1.iterator();
        while(it.hasNext()){
            int k = 0;
            Integer x = (Integer)it.next();
            for(int i = 1;i<=x;i++)
                if(x%i==0)
                    k++;
            if(k>2)
                it.remove();
        }
        return new MySet(set1);
    }
    MySet peresech(MySet a){
        TreeSet<Integer> set1 = a.getSet();
        TreeSet<Integer> res = new TreeSet<>();
        Iterator it = set1.iterator();
        while(it.hasNext()){
            Integer x = (Integer)it.next();
            if(set.contains(x)){
                res.add(x);
            }
        }
        return new MySet(res);
    }
    MySet razn(MySet a){
        TreeSet<Integer> set1 = a.getSet();
        TreeSet<Integer> res = new TreeSet<Integer>(set);
        for(Integer integer:set1)
            if(set1!=res)
                res.remove(integer);
        return new MySet(res);
    }
}
