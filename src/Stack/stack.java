package Stack;
import java.util.Stack;
import java.util.Scanner;
public class stack {
    public static Stack<String> n_pops(Stack<String> a,int n){
        for(int i=0;i<n;i++){
            a.pop();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
        n_pops(cities,2);
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

        //4th
        Stack<Integer> stack2=new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        stack2.push(10);
        System.out.println("Size of the stack:"+stack2.size());
        while(true){
            if(stack2.size()==3){
                System.out.println(stack2);
                break;
            }
            stack2.pop();
        }

        //5th
        int[] arr={1,2,3,4,5,6};
        Stack<Integer> reversed_array=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            reversed_array.push(arr[i]);
        }
        System.out.println("Reversed array using stack: "+reversed_array);

        //6th
        String word=sc.nextLine();
        word.toLowerCase();
        Stack<Character> stack3=new Stack<>();
        for(int i=0;i<word.length();i++){
            stack3.push(word.charAt(i));
        }
        int left=0;
        int right=stack3.size()-1;
        for(int i=0;i<stack3.size();i++){
            if(left==right || right-left==1){
                System.out.println("Pallindrome");
                break;
            }
            if(stack3.get(left)!=stack3.get(right)){
                System.out.println("Not pallindrome");
                break;
            }
            else{
                left++;
                right--;
            }
        }

        //7th
        Stack<String> history=new Stack<>();
        history.push("google");
        history.push("yt");
        history.push("github");
        history.push("linkedin");
        history.push("gpt");
        n_pops(history,3);
        System.out.println("After get back 3 times: "+history);

        //8th
        System.out.print("Enter a decimal number:");
        int n=sc.nextInt();
        Stack<Integer> binary=new Stack<>();
        while(n>0){
            binary.push(n%2);
            n/=2;
        }
        while(true){
            if(!binary.isEmpty())
                System.out.print(binary.pop());
            else
                break;
        }
        
    }
}
