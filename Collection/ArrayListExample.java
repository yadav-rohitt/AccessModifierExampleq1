import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Satara");
        cities.add("Nasik");
        
        for (String city : cities) {
            System.out.println(city);
        }
    }
}