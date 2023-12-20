package individual_arraylist;
import java.util.*;

public class Individual_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        CityRussia cr = new CityRussia();
        System.out.println("Enter count city: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Name: ");
            String name = scL.nextLine();
            System.out.println("Population: ");
            int population = sc.nextInt();
            System.out.println("Square: ");
            int square = sc.nextInt();
            System.out.println("District: ");
            String district = scL.nextLine();
            City c = new City(name,population,square,district);
            cr.add(c);
        }
        System.out.println("Who delate?");
        String f = scL.nextLine();
        cr.del(f);
        
        System.out.println("Sort by Square: ");
        cr.sortBySquare();
        cr.print();
        
        System.out.println("Find by City name");
        String names = scL.nextLine();
        cr.find(names);
    }
}
