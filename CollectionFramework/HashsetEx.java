package CollectionFramework;
import java.util.Set;
import java.util.HashSet;

public class HashsetEx {
    public static void main(String[] args) {
        //Implements set interface
        Set<Integer> roll=new HashSet<>();
        roll.add(10);
        roll.add(20);
        roll.add(30);
        roll.add(40);
        var itr=roll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        HashSet<Object> employee=new HashSet<>();
        employee.add("manas");
        employee.add("Roshan");
        System.out.println(employee);
        var emp=employee.iterator();
        while(emp.hasNext()){
            System.out.println(emp.next());
        }
        System.out.println(employee.contains("manas"));
    }
}
