package LinkedList;
import java.util.LinkedList;

public class linkedlist{
    public static void main(String[] args) {

        //1st
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        System.out.println("First subject -> "+subjects.getFirst()+"\n"+"Last subject -> "+subjects.getLast());
    }
}