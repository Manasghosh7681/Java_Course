package CollectionFramework;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Object> emp=new PriorityQueue<>();
        emp.add("manas");
        emp.add("Tapas");
        emp.add("Asish");       //If insertion fails throws an exception
        Iterator<Object> e=emp.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
        emp.offer("30");      //If insertion fails it return false
        emp.remove("Manas");
        System.out.println(emp.poll());     //it remove and return the highest priority element of the queue
        System.out.println(emp.poll());
        System.out.println(emp.peek());     //It only return the highest priority element
        
    }
}
