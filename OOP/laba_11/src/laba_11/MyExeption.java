package laba_11;
import java.util.*;

class MyExeption extends Exception{
    String name;
    int d,m,y;
    MyExeption(String name, int d, int m, int y){
        super(name);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    String getDate(){
        return d+"."+m+"."+y;
    }
}
 