package laba_9;
import java.util.ArrayList;

class StudentGroup {
    ArrayList<Students>a;
    StudentGroup(){
        a = new ArrayList<Students>();
    }
    void add(Students s){
        a.add(s);
    }
    void del(String name){
        int p = -1;
        for(int i = 0;i<a.size();i++){
            if(name.equalsIgnoreCase(a.get(i).getName()))
                p = i;
        }
        if(p>-1){
            a.remove(p);
            System.out.println("delate student:" + name);
        }
        else System.out.println("student no");
    }
    void print(){
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
}