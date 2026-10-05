package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> num=new ArrayDeque<>();
        num.add(10);
        num.addLast(20);
        num.addFirst(30);

        num.offer(40);
        num.offerFirst(50);
        num.offerLast(60);

        num.push(70);
        
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.peekLast());
        System.out.println(num.peekFirst());

        System.out.println(num.remove());
        System.out.println(num.removeLast());
        System.out.println(num.removeFirst());

        System.out.println(num.poll());
        System.out.println(num.pollFirst());
        System.out.println(num.pollLast());

        System.out.println(num.pop());
    }
}
