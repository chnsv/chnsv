package individual;
import java.util.*;

public class Individual 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for Student: ");
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        String w = sc.nextLine();
        System.out.println("Enter teacher: ");
        String teacher = sc.nextLine();
        
        Student s = new Student(name, year, teacher);
        System.out.println("Data student");
        System.out.println(s.toString());
        
        System.out.println("Enter ex_1: ");
        String ex_1 = sc.nextLine();
        System.out.println("Enter ex_2: ");
        String ex_2 = sc.nextLine();        
        System.out.println("Enter ex_3: ");
        String ex_3 = sc.nextLine();
        System.out.println("Enter ex_4: ");
        String ex_4 = sc.nextLine();
        
        System.out.println("Otsenka_1: ");
        int o1 = sc.nextInt();
        System.out.println("Otsenka_2: ");
        int o2 = sc.nextInt();
        System.out.println("Otsenka_3: ");
        int o3 = sc.nextInt();
        System.out.println("Otsenka_4: ");
        int o4 = sc.nextInt();
        
        Graduate g = new Graduate(name, year, teacher, ex_1, ex_2, ex_3, ex_4, o1, o2, o3, o4);
        
        System.out.println("Data graduate");
        System.out.println(g.toString());
    }   
}
