package laba_3;

public class func
{
    static boolean prost(int x)
    {
        if(x < 2) return true;
        for(int d = 2; d < x; d++)
            {
                if(x % d == 0) return false;
            }
        return true;
    }
    
    static boolean sov(int x)
    {
        int s = 0;
        if(x != 0 && x != 1)
        {
            for(int d = 1;d<x;d++)
            {
                if(x % d == 0)
                {
                    s +=d;
                }
            }
        }
        if(x == s) 
        {
            return true;
        }
        return false;
    }
}