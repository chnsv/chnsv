package laba_14;
import java.util.*;

public class MyList {
    LinkedList<String> list;
    MyList(){
        list= new LinkedList<String>();
    }
    void createlist(){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        while(!s.equals("")){
            list.addLast(s);
            s = sc.nextLine();
        }
    }
    void print(){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    void print_reverse(){
        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
    void del(String s){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            if(it.next().equals(s))
                it.remove();
        }
    }
    boolean simm(){
        ListIterator<String> it = list.listIterator();
        ListIterator<String> reit = list.listIterator(list.size());
        while(it.hasNext() && reit.hasPrevious()){
            if(!it.next().equals(reit.previous()))
                return false;
        }
        return true;
    }
    void delEnd(String f){ //???
        ListIterator<String> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            if(it.previous().equals(f))
                it.remove();
        }
    }
    void dubl(){
        /*for(int i = 0;i<list.size();i++){
            String temp = list.get(i);
            list.add(i+1,temp);
            i++;
        }
        System.out.println(list);*/
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String temp = it.next();
            it.add(temp);
        }
        System.out.println(list);
    }
    void dobavl(){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<String> reit = list.listIterator(list.size());
        while(reit.hasPrevious()){
            System.out.println(reit.previous());
        }
    }
}