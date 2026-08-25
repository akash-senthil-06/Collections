package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
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
        nums.addFirst(0);
        nums.addFirst(11);
        nums.addFirst(22);
        nums.addLast(6);
        nums.addLast(7);
        nums.addLast(8);
        System.out.println("After adding: "+nums);

        //3rd
        LinkedList<String> colors=new LinkedList<>();
        colors.add("black");
        colors.add("white");
        colors.add("red");
        colors.add("blue");
        System.out.println("Before removing: "+colors);
        colors.removeFirst();
        colors.removeLast();
        System.out.println("After removing: "+colors);

        //4th
        System.out.print("Enter a element: ");
        int element=sc.nextInt();
        System.err.println(nums.contains(element)?"Yes":"No");
    }
}