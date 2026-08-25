package Stack;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        
        //1st
        Stack<Integer> num1=new Stack<>();
        num1.push(1);
        num1.push(2);
        num1.push(3);
        num1.push(4);
        num1.push(5);
        System.out.println("Before popping: "+num1);
        int num1_size=num1.size();
        for(int i=0;i<num1_size;i++){
            num1.pop();
            System.out.println("After popping element "+(i+1)+" :"+num1);
        }
    }
}
