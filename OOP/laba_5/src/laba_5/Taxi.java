package laba_5;
import java.util.*;

class Taxi extends Avto
{
    private String driver;
    private int pricekm;
    Taxi(String marka, String number, String vin, int year, double vol, int price, int km, String driver, int pricekm)
    {
        super(marka, number, vin, year, vol, price, km);
        this.driver = driver;
        this.pricekm = pricekm;
    }
    
    double stoim(double km) {return km*pricekm;}
    
    String getDriver() {return driver;}
    int getPricekm() {return pricekm;}
    String setDriver() {return driver;}
    int setPricekm() {return pricekm;}
    
    public String toString()
    {
        return super.toString() + "\n Driver: " + driver + "\n PriceKm: " + pricekm;
    }
}