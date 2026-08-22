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

        //2nd
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(56);
        marks.add(23);
        marks.add(58);
        marks.add(19);
        marks.add(65);
        int sum=0;
        for(int a:marks){
            sum+=a;
        }
        System.out.println(sum);
    }
}
