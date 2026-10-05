package CollectionFramework;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> number= new TreeSet<Integer>();
        number.add(34);
        number.add(20);
        number.add(456);
        number.add(10);
        Iterator<Integer> itr=number.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(number.contains(30));
        System.out.println(number.isEmpty());
        System.out.println(number.size());
    }
}
