package ArrayList;
import java.util.*;
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

        //3rd
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("watermelon");
        fruits.add("kiwi");
        fruits.remove(2);
        for(String a:fruits){
            System.out.println(a);
        }

        //4th
        ArrayList<String> programming=new ArrayList<>();
        programming.add("C");
        programming.add("Java");
        programming.add("Python");
        programming.add("C++");
        programming.add("C#");
        System.out.println(programming.contains("Java")?"Yes":"No");

        //5th
        ArrayList<Integer> mark=new ArrayList<>();
        mark.add(56);
        mark.add(23);
        mark.add(58);
        mark.add(19);
        mark.add(65);
        int max=mark.get(0);
        for(int a:marks){
            if(max<=a)
                max=a;
        }
        System.out.println(max);

        //6th
        country.add("asia");
        country.add("zimbabe");
        Collections.sort(country);
        for(String a:country){
            System.out.println(a);
        }
    }
}
