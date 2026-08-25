package LinkedList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Queue;

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

        //5th
        Queue<String> bank=new LinkedList<>();
        bank.add("Customer1");
        bank.add("Customer2");
        bank.add("Customer3");
        bank.add("Customer4");
        bank.add("Customer5");
        System.out.println("Initially:"+bank);
        bank.poll();
        System.out.println("After serving customer 1:"+bank);
        bank.poll();
        System.out.println("After serving customer 2:"+bank);
        bank.poll();
        System.out.println("After serving customer 3:"+bank);
        bank.poll();
        System.out.println("After serving customer 4:"+bank);
        bank.poll();
        System.out.println("After serving customer 5:"+bank);

        //6th
        LinkedList<String> history=new LinkedList<>();
        history.push("Google");
        history.push("Youtube");
        history.push("Github");
        System.out.println("Browser History:"+history);
        history.pop();
        System.out.println("After 1st navigation:"+history);
        history.pop();
        System.out.println("After 2nd navigation:"+history);
        history.pop();
        System.out.println("After 3rd navigation:"+history);

        //7th
        LinkedList<Integer> list1=new LinkedList<>(List.of(1,2,3,4,5,6,7));
        System.out.println("1st Approach");
        LinkedList<Integer> result=new LinkedList<>();
        for(int i=list1.size()-1;i>=0;i--){
            result.add(list1.get(i));
        }
        System.out.println("Before Reversing"+list1);
        System.out.println("After Reversing"+result);

        System.out.println("2nd Approach");
        System.out.println("Before Reversing"+list1);
        int first=0;
        int last=list1.size()-1;
        int temp=0;
        for(int i:list1){
            if(first-last==1||first==last)
                break;
            if(first!=last){
                temp=list1.get(last);
                list1.set(first,temp);
                list1.set(last,i);
                first++;
                last--;
            }
        }
        System.out.println("After reversing: "+list1);

        //8th
        int sum=0;
        for(int i:list1)
            sum+=i;
        System.out.println("Sum of the elements in list 1 is: "+sum);
    }
}