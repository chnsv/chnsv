package individual;
import java.util.*;

class Graduate extends Student
{
    private String ex_1;
    private String ex_2;
    private String ex_3;
    private String ex_4;
    private int o1;
    private int o2;
    private int o3;
    private int o4;
    
    Graduate(String name, int year, String teacher, String ex_1, String ex_2, String ex_3, String ex_4, int o1, int o2, int o3, int o4)
    {
        super(name, year, teacher);
        this.ex_1 = ex_1;
        this.ex_2 = ex_2;
        this.ex_3 = ex_3;
        this.ex_4 = ex_4;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
    }
        
    String getEx_1() {return ex_1;}
    String getEx_2() {return ex_2;}
    String getEx_3() {return ex_3;}
    String getEx_4() {return ex_4;}
    int getO1() {return o1;}
    int getO2() {return o2;}
    int getO3() {return o3;}
    int getO4() {return o4;}
    void setEx_1(String ex_1) {this.ex_1 = ex_1;}
    void setEx_2(String ex_2) {this.ex_2 = ex_2;}
    void setEx_3(String ex_3) {this.ex_3 = ex_3;}
    void setEx_4(String ex_4) {this.ex_4 = ex_4;}
    void setO1() {this.o1 = o1;}
    void setO2() {this.o2 = o2;}
    void setO3() {this.o3 = o3;}
    void setO4() {this.o4 = o4;}

    public String toString()
    {
        return super.toString() + "\n Ex_1: " + ex_1 + "\n Ex_2: " + ex_2 + "\n Ex_3: " + ex_3 + "\n Ex_4: " + ex_4 + "\n O1: " + o1 + "\n O2: " + o2 + "\n O3: " + o3 + "\n O4: " + o4;
    }
}