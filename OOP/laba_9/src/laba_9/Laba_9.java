package laba_9;
import java.util.*;

public class Laba_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        StudentGroup sg = new StudentGroup();
        System.out.println("Enter count student: ");
        int n = sc.nextInt();
        for(int j = 0;j<n;j++){
            System.out.println("Name: ");
            String name = scL.nextLine();
            System.out.println("Adress: ");
            String adress = scL.nextLine();
            System.out.println("facultet: ");
            String facultet = scL.nextLine();
            System.out.println("Kurs: ");
            int kurs = sc.nextInt();
            int []marks = new int[4];
            System.out.println("Enter marks");
            for(int i = 0; i <marks.length;i++){
                marks[i] = sc.nextInt();
            }
            Students s = new Students(name,adress,facultet,kurs,marks);
            sg.add(s);
        }
        System.out.println("Who delate?");
        String f = scL.nextLine();
        sg.del(f);
        sg.print();
    }   
}
