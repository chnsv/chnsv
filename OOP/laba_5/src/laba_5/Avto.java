package laba_5;
import java.util.*;

class Avto 
{
    String marka;
    String number;
    String vin;
    int year;
    double vol;
    int price;
    int km;
    Avto(String marka, String number, String vin, int year, double vol, int price, int km)
    {
        this.marka = marka;
        this.number = number;
        this.vin = vin;
        this.year = year;
        this.vol = vol;
        this.price = price;
        this.km = km;
    }
    public String toString()
    {
        return "Mark: " + marka + "\n Number: " + number + "\n Vin: " + vin + "\n Year: " + year + "\n V dvigat: " + vol + "\n Price: " + price + "\n Probeg: "+ km;
    }
    String getMarka() { return marka; }
    String getNumber() { return number; }
    String getVin() { return vin; }
    int getYear() { return year; }
    double getDvigat() { return vol; }
    int getPrice() { return price; }
    int getProbeg() { return km; }
    String setMarka() { return marka; }
    String setNumber() { return number; }
    String setVin() { return vin; }
    int setYear() { return year; }
    double setDvigat() { return vol; }
    int setPrice() { return price; }
    int setProbeg() { return km; }
}
