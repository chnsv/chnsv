package individual_graph_interface;
import java.util.Comparator;

class City implements Comparator<City>{
    String name, district;
    int population, square;
    
    String getName() {return name;}
    int getPopulation() {return population;}
    int getSquare() {return square;}
    String getDistrict() {return district;}
    
    void setName(String nameG) {name = nameG;}
    void setPopulation(int populationG) {population = populationG;}
    void setSquare(int squareG) {square = squareG;}
    void setDistrict(String districtG) {district = districtG;}
    
    City(String nameGor, String populationGor, String squareGor, String districtGor){
        name = nameGor;
        population = Integer.parseInt(populationGor);
        square = Integer.parseInt(squareGor);
        district = districtGor;
    }
    public String toString(){
        return "Name: " + name + "\n Population: " + population + "\n Square: " + square + "\n District: " + district;
    }
    
    public int compare(City s1, City s2){
        return s1.getSquare()-s2.getSquare();
    }
    public static Comparator<City> SquareComparator = new Comparator <City>(){
        public int compare(City s1,City s2){
            return s1.getName().compareTo(s2.getName());
        }
    };
}