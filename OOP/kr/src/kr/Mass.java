package kr;
import java.util.*;

class Mass<T extends Comparable<T>> {
    T[]a;
    Mass(T[]a){
        this.a = a.clone();
    }
    void print(){
        for(int i = 0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    T elemByInd(int i) throws ArrayIndexOutOfBoundsException{
        if(i<0 || i>=a.length)
            throw new ArrayIndexOutOfBoundsException("Vihod za granitsi indexa");
        return a[i];
    }
    
    T max(){
        T res = a[0];
        for(int i = 0;i<a.length;i++){
            if(a[i].compareTo(res)>0){
                res=a[i];
            }
        }
        return res;
    }
    void zamen(){
        for(int i = 0;i<a.length;i+=2){
            a[i]= max();
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    boolean simm(){
        if(a==null || a.length==0)
            return true;
        for(int i = 0;i<a.length/2;i++){
            if(!a[i].equals(a[a.length-1-i])){
                return false;
            }
        }
        return true;
    }
    
    int elemMinInd(){
        int minIndex = 0;
        for(int i = 1;i<a.length;i++){
            if(a[i].compareTo(a[minIndex])<0)
                minIndex=i;
        }
        return minIndex;
    }
}
