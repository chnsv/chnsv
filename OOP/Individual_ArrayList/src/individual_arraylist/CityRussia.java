package individual_arraylist;
import java.util.ArrayList;

class CityRussia {
    ArrayList<City>a;
    CityRussia(){
        a = new ArrayList<City>();
    }
    void add(City c){
        a.add(c);
    }
    void del(String name){
        int p = -1;
        for(int i = 0;i<a.size();i++){
            if(name.equalsIgnoreCase(a.get(i).getName()))
                p = i;
        }
        if(p>-1){
            a.remove(p);
            System.out.println("delate city:" + name);
        }
        else System.out.println("city no");
    }
    void find(String name){
        boolean f = false;
        for(int i = 0;i<a.size();i++){
            if(name.equalsIgnoreCase(a.get(i).getName())){
                f = true;
                System.out.println(a.get(i).toString());
            }
        }
        if(!f){
            System.out.println("City not find");
        }
    }
    void sortBySquare(){
        a.sort(City.SquareComparator);
    }
    void print(){
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
}
