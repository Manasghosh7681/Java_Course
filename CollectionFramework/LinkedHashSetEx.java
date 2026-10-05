package CollectionFramework;
import  java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Iterator;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        Collection<Object> emp=new LinkedHashSet<>();
        emp.add("Manas");
        emp.add("Asish");
        emp.add("Roshan");
        System.out.println(emp);
        var itr=emp.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println(emp.contains("Manas"));

        //Using LinkedHashSet
        LinkedHashSet<Integer> number=new LinkedHashSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        Iterator<Integer> num=number.iterator();
        while (num.hasNext()) {
            System.out.println(num.next());
        }
        var num2=number.iterator();     //var allows the compiler to automatically determine the datatype.
        while(num2.hasNext()){
            System.out.println(num2.next());
        }


    }
}
