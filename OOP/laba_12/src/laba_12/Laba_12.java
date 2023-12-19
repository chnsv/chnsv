package laba_12;
import java.util.*;

public class Laba_12 {
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
            System.out.println("Chast massiva do 2 elementa:");
            mi.chast(2);
            System.out.println("Vivid obratnii:");
            mi.obr();
            System.out.println("max = " + mi.max());
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
            System.out.println("Element pod indexom 3:");
            System.out.println(md.elemByInd(3));
            System.out.println("Vivod massiva:");
            md.print();
            System.out.println("Chast massiva do 2 elementa:");
            md.chast(2);
            System.out.println("Vivid obratnii:");
            md.obr();
            System.out.println("max = " + md.max());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Size mass[string]:");
        int m = sc.nextInt();
        //массив строк
        String[]m3=new String[m];
        for(int i=0;i<m3.length;i++){
            m3[i]=sc.nextLine();
        }
        Mass<String> ms = new Mass<>(m3);
        try{
            System.out.println("Element pod indexom 3:");
            System.out.println(ms.elemByInd(3));
            System.out.println("Vivod massiva:");
            ms.print();
            System.out.println("Chast massiva do 2 elementa:");
            ms.chast(2);
            System.out.println("Vivid obratnii:");
            ms.obr();
            System.out.println("max = " + ms.max());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }   
}
