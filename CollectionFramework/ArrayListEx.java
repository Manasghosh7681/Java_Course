package CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
public class ArrayListEx {

    public static void main(String[] args) {

        //Using Collection
        Collection<Object> employee=new ArrayList<>();
        employee.add("Manas");
        System.out.println(employee);
        Collection<Object> newEmp=new ArrayList<>();
        newEmp.add("Asish");
        newEmp.add("Abhisek");
        newEmp.add("Subas");
        employee.addAll(newEmp);
        System.out.println(employee);
        

        //ArrayList as Object
        ArrayList<Object> Student=new ArrayList<>();
        Student.add("Manas");
        Student.add(23);
        Student.add(5.11);
        Student.add(true);
        System.out.println(Student);
        Student.remove(true);
        System.out.println(Student);
        System.out.println(Student.get(0));
        System.out.println(Student.set(1,"Ghosh"));
        System.out.println(Student.contains("Hello"));
        System.out.println(Student.isEmpty());
        System.out.println(Student.size());
        System.out.println(Student.indexOf("Ghosh"));
        System.out.println(Student.lastIndexOf("Manas"));
        Student.clear();
        System.out.println(Student);

        //ArrayList for String
        ArrayList<String> name=new ArrayList<>();
        name.add("Manas Ghosh");
        name.add("Manas Ghosh");
        name.add("Manas Ghosh");
        name.add("Asish Nayak");
        name.remove("Asish Nayak");
        System.out.println(name.size());
        System.out.println(name.get(0));
        System.out.println(name.set(0,"Abhisek Samal"));
        System.out.println(name.contains("Abhisek Samal"));
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("Abhisek Samal"));
        System.out.println(name.lastIndexOf("Manas Ghosh"));
        name.clear();

        //Arraylist for Interger
        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(number.get(1));
        System.out.println(number.set(1,40));
        System.out.println(number);
        System.out.println(number.contains(20));
        System.out.println(number.lastIndexOf(10));
        System.out.println(number.indexOf(10));
        System.out.println(number.isEmpty());
        System.out.println(number.size());
        System.out.println(number.remove(0));
        number.clear();

    }
}