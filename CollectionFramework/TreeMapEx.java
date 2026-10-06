package CollectionFramework;
import java.util.TreeMap;
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> Student=new TreeMap<>();
        Student.put(101,"Manas");
        Student.put(102,"Asish");
        Student.put(103,"Ganesh");
        Student.put(104,"Anuradha");
        Student.put(105,"Chiranjib");
        Student.put(106,"Shrabani");

        System.out.println(Student);
        System.out.println(Student.firstKey());
        System.out.println(Student.lastKey());
        System.out.println(Student.higherKey(104));
        System.out.println(Student.higherEntry(103));
        System.out.println(Student.firstEntry());
        System.out.println(Student.lastEntry());
        System.out.println(Student.pollFirstEntry());
        System.out.println(Student.pollLastEntry());
    }
}
