package kr_djenerics;
import java.util.*;

public class KR_Djenerics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size mass[][]: ");
        int n = sc.nextInt();
        Integer[][]m1= new Integer[n][n];
        for(int i=0;i<m1.length;i++){
            for(int j = 0;j<m1.length;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        Matrix<Integer> mi = new Matrix<>(m1);
        try{
            System.out.println("Vivod massiva:");
            mi.print();
            System.out.println("Elem pod indexom [1][2] = " + mi.elemByInd(1,2));
            System.out.println("Stroka s max elem:" /*+ Arrays.toString(mi.maxEl())*/);
            mi.maxEl();
            System.out.println();
            System.out.println("Smena strok: ");
            mi.obr();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
