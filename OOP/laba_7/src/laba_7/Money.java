package laba_7;
import java.util.*;

class Money {
    int rub;
    int k;
    Money(int rub, int k){
        this.rub = rub;
        this.k = k;
    }
    Money s(Money m)
    {
        int rubl = this.rub + m.getRub();
        int kop = this.k + m.getK();
        if(k>=100)
        {
            rub += k%100;
            k /= 100;
        }
            return new Money(rub,k);
    }
    

    public String toString()
    {
        if(rub%10 == 1 && rub%100!=11)
        {
            if(k == 1 && k%100!=11) return rub + "рубль: " + k + "копейка: ";
            if((k%10 == 2 || k%10 == 3 || k%10 == 4) && (k%100!=12 || k%100!=13 || k%100!=14)) return rub + "рубль: " + k + "копейки: ";
            return rub + "рубль: " + k + "копеек: ";
        }
        if((rub%10 == 2 || rub%10 == 3 || rub%10 == 4) && (rub%100!=12 || rub%100!=13 || rub%100!=14))
        {
            if(k == 1 && k%100!=11) return rub + "рубля: " + k + "копейка: ";
            if((k%10 == 2 || k%10 == 3 || k%10 == 4) && (k%100!=12 || k%100!=13 || k%100!=14)) return rub + "рублья: " + k + "копейки: ";
            return rub + "рубля: " + k + "копеек: ";
        }
        if(k == 1 && k%100!=11) return rub + "рублей: " + k + "копейка: ";
        if((k%10 == 2 || k%10 == 3 || k%10 == 4) && (k%100!=12 || k%100!=13 || k%100!=14)) return rub + "рублей: " + k + "копейки: ";
        return rub + "рублей: " + k + "копеек: ";
    }
    
    int getRub() { return rub; }
    int getK() { return k; }

    void setRub(int rub) { this.rub = rub; }
    void setK(int k) { this.k = k; }
}
