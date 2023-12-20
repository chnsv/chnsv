package laba_4;
import java.util.*;

public class Triangle 
{
    private Point p1, p2, p3;
    public Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    double A() {return p1.dist(p2);}
    double B() {return p2.dist(p3);}
    double C() {return p3.dist(p1);}
    
    double Per()
    {
        double p;
        p = A() + B() + C();
        return p;
    }
    double plosh()
    {
        double ppol = Per() / 2;
        double pl;
        pl = Math.sqrt(ppol) * (ppol - A())*(ppol - B())*(ppol - C());
        return pl;
    }
}
