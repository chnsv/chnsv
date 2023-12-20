package laba_5;
import java.util.*;

public class Laba_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data for avto: ");
        System.out.println("Enter mark: ");
        String marka = sc.nextLine();
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        System.out.println("Enter vin: ");
        String vin = sc.nextLine();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter V dvigatela: ");
        double vol = sc.nextDouble();
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        System.out.println("Enter probeg: ");
        int km = sc.nextInt();
        
        Avto a = new Avto(marka, number, vin, year, vol, price, km);
        System.out.println("Data avto");
        System.out.println(a.toString());
        
        String q = sc.nextLine();
        System.out.println("Enter fio: ");
        String f = sc.nextLine();
        System.out.println("Enter price on km: ");
        int pricekm = sc.nextInt();
        
        Taxi t = new Taxi(marka, number, vin, year, vol, price, km, f, pricekm);
        
        System.out.println("Enter dalnost rast in km: ");
        double km1 = sc.nextInt();
        System.out.println("Stoimost poezdki = " + t.stoim(km1));
        System.out.println("Data taxi");
        System.out.println(t.toString());
    }
    
}
