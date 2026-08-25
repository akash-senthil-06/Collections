package Stack;
import java.util.Stack;
public class stack {

    public static Stack<String> two_pops(Stack<String> a){
        for(int i=0;i<2;i++){
            a.pop();
        }
        return a;
    }
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

        //2nd
        Stack<String> cities=new Stack<>();
        cities.push("Trichy");
        cities.push("Tanjore");
        cities.push("Chennai");
        cities.push("Madurai");
        // int cities_size=cities.size();
        // for(int i=0;i<cities_size;i++){
        //     if(cities.isEmpty())
        //         break;
        //     System.out.println(cities.peek());
        //     two_pops(cities);
        // }
        System.out.println("Peek city: "+cities.peek());
        two_pops(cities);
        System.out.println("After popping two cities: "+cities);

        //3rd
        Stack<Integer> stack1=new Stack<>();
        System.out.println("Before pushing: ");
        System.out.println(stack1.isEmpty()?"The stack is empty":"The stack is not empty");
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("Ater pushing: ");
        System.out.println(stack1.isEmpty()?"The stack is empty":"The stack is not empty");
    }
}
