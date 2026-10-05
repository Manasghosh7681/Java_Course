package CollectionFramework;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Object> Student=new Vector<>();
        Student.add("Manas");
        Student.add("Manas");
        Student.addFirst("Roshan");
        Student.addLast("Subrat");
        System.out.println(Student.size());
        System.out.println(Student.contains("Manas"));
        System.out.println(Student.get(1));
        System.out.println(Student.set(2,"Subrat Hota"));
        System.out.println(Student.indexOf("Roshan"));
        System.out.println(Student.lastIndexOf("Manas"));
        System.out.println(Student.isEmpty());
        Student.remove("Roshan");
        System.out.println(Student);
    }
}
