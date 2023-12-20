package individual_graph_interface;
import java.util.ArrayList;

class CityRussia {
    ArrayList<City>a;
    ArrayList<City> getAddrCity() {
        return  a;
    };
    City getLast(){
        return a.get(a.size() - 1);}
    CityRussia(){
        a = new ArrayList<City>();
    }
    void add(City c){
        a.add(c);
    }
    void del(City c){
        System.out.println(c.getName()+ "removed");
        a.remove(c);
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
