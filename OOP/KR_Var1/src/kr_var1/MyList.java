package kr_var1;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyList {
    LinkedList<Integer> list;
    MyList(){
        list= new LinkedList<Integer>();
    }
    void createlist(){
        Integer s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        while(!s.equals(0)){
            list.addLast(s);
            s = sc.nextInt();
        }
    }
    void print(){
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    boolean sov(Integer s){
        int d = 0;
        for(int i=1;i<s;i++){
            if(s%i==0) d+=i;
        }
        if(d==s) return true;
        return false;
    }
    
    void del(){
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            if(sov(it.next())==true)
                it.remove();
        }
    }
    boolean simm(){
        ListIterator<Integer> it = list.listIterator();
        ListIterator<Integer> reit = list.listIterator(list.size());
        while(it.hasNext() && reit.hasPrevious()){
            if(!it.next().equals(reit.previous()))
                return false;
        }
        return true;
    }
}