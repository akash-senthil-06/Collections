package ArrayList;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //1st
        ArrayList<String> country=new ArrayList<>();
        country.add("India");
        country.add("China");
        country.add("Japan");
        country.add("Pakistan");
        country.add("Malasiya");
        for(String a:country){
            System.out.println(a);
        }
    }
}
