package CollectionFramework;
import java.util.Stack;;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(20));
        stack.add(40);
        System.out.println(stack.get(2));
        System.out.println(stack.set(0,100));
        System.out.println(stack);
    }
}
