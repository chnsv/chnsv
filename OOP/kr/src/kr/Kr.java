package kr;
import java.util.*;

public class Kr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size mass[int]: ");
        int n = sc.nextInt();
        //целые
        Integer[]m1= new Integer[n];
        for(int i=0;i<m1.length;i++){
            m1[i]=sc.nextInt();
        }
        Mass<Integer> mi = new Mass<>(m1);
        try{
            System.out.println("Element pod indexom 2:");
            System.out.println(mi.elemByInd(2));
            System.out.println("Vivod massiva:");
            mi.print();
            System.out.println("Proverka na simm:" + mi.simm());
            System.out.println("Index min:");
            System.out.println(mi.elemMinInd()); 
            System.out.println("Zamena:");
            mi.zamen();      
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Size mass[double]:");
        int k = sc.nextInt();
        //вещественные
        Double[]m2=new Double[k];
        for(int i=0;i<m2.length;i++){
            m2[i]=sc.nextDouble();
        }
        Mass<Double> md = new Mass<>(m2);
        try{
            System.out.println("Element pod indexom 2:");
            System.out.println(md.elemByInd(2));
            System.out.println("Vivod massiva:");
            md.print();
            System.out.println("Proverka na simm:" + md.simm());
            System.out.println("Index min:");
            System.out.println(md.elemMinInd()); 
            System.out.println("Zamena:");
            md.zamen();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }    
}
