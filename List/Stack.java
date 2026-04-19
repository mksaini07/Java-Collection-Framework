package List;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        //Stack Extends Vector
        stack.add(1);
        stack.push(2);
        stack.add(3);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.indexOf(2)); //index start from 1
        System.out.println(stack.search(3));


    }
}
