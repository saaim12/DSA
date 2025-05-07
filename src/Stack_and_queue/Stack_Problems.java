package Stack_and_queue;

import java.util.Stack;

public class Stack_Problems {
    public static void main(String[] args) {
        System.out.println(Parenthesis_problem("{[(]}"));
        System.out.println(evalRPN(new String[]{"1","2","+","3","*","4","-"}));
    }
    public static boolean Parenthesis_problem(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '{' || c== '[' || c=='('){
                stack.push(c);
            }
            if(c=='}'){
                if( stack.isEmpty() || stack.peek() !='{'){ // this can crash the program if we checking the inside and not first checking if the stack is empty
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            if(c==']'){
                if( stack.isEmpty() || stack.peek() !='['){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
            if(c==')'){
                if(stack.isEmpty() || stack.peek() !='(' ){
                    return false;
                }
                else {
                    stack.pop();
                }
            }

        }


        return stack.isEmpty();
    }

        public static int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();

            for (String token : tokens) {
                if (token.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (token.equals("-")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (token.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                } else {
                    stack.push(Integer.parseInt(token));  // It's a number
                }
            }

            return stack.pop(); // Final result
        }

}
