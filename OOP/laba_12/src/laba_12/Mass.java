package laba_12;
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
    
    void obr(){
        for(int i=0;i<a.length/2;i++){
            T t=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=t;
            
        }
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    void chast(int p) throws ArrayIndexOutOfBoundsException{
        if(p<0 || p>= a.length)
            throw new ArrayIndexOutOfBoundsException("Vihod za granitsi indexa");
        for(int i = 0;i<p;i++)
            System.out.print(a[i]+" ");
        System.out.println();
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
}
