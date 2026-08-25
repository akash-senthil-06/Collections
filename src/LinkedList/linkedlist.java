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

        //2nd
        LinkedList<Integer> nums=new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Before adding: "+nums);
        nums.push(0);
        nums.push(11);
        nums.push(22);
        nums.addLast(6);
        nums.addLast(7);
        nums.addLast(8);
        System.out.println("After adding: "+nums);
    }
}