package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> number=new ArrayDeque<>();
        number.add(10);
        number.addFirst(20);
        number.addLast(30);
        System.out.println(number);

        number.offer(40);
        number.offerFirst(50);
        number.offerLast(60);

        System.out.println(number);
        System.out.println(number.peek());
        System.out.println(number.peekFirst());
        System.out.println(number.peekLast());

        System.out.println(number.remove());
        System.out.println(number.removeFirst());
        System.out.println(number.removeLast());

        System.out.println(number);
        System.out.println(number.poll());
        System.out.println(number.pollFirst());
        System.out.println(number.pollLast());

        number.push(10);
        number.push(20);
        number.push(30);
        System.out.println(number);
        System.out.println(number.pop());
        System.out.println(number.size());
        System.out.println(number.isEmpty());
        System.out.println(number.contains(30));
        
    }          
}
