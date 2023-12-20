package individual_arraylist;
import java.util.Comparator;

class City {
    String name, district;
    int population, square;
    City(String name, int population, int square, String district){
        this.name = name;
        this.population = population;
        this.square = square;
        this.district = district;
    }
    
    String getName() {return name;}
    int getPopulation() {return population;}
    int getSquare() {return square;}
    String getDistrict() {return district;}
    
    void setName(String name) {this.name = name;}
    void setPopulation(int population) {this.population = population;}
    void setSquare(int square) {this.square = square;}
    void setDistrict(String district) {this.district = district;}
    
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
