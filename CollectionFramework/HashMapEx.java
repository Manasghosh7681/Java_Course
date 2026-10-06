package CollectionFramework;
import java.util.HashMap;
// import java.util.Map;
public class HashMapEx {
    public static void main(String[] args) {

        // Map<Integer, String> student = new HashMap<>();
        HashMap<Integer, String> student = new HashMap<>();

        // put() used to add key-value pair into HashMap
        student.put(101, "Manas");
        student.put(102, "Asish");
        student.put(103, "Subas");

        HashMap<Integer, String> newStudent = new HashMap<>();

        // putAll() used to add all key-value pairs from another HashMap
        newStudent.put(104, "Abhisek");
        newStudent.put(105, "Debabrata");
        newStudent.put(106, "Anuradha");

        student.putAll(newStudent);

        System.out.println(student);

        // get() is used to get the value using key
        System.out.println(student.get(103));

        // getOrDefault() returns the value if key exists,
        // otherwise it returns the default value
        System.out.println(student.getOrDefault(109, "Not Found"));

        // containsKey() checks whether the key exists or not
        System.out.println(student.containsKey(107));

        // containsValue() checks whether the value exists or not
        System.out.println(student.containsValue("manas"));

        // replace() replaces the value associated with a key
        System.out.println(student.replace(105, "Subrat"));

        // replaceAll() replaces all values
        student.replaceAll((key, value) -> value.toUpperCase());

        System.out.println(student);

        // keySet() returns a Set containing all keys
        System.out.println(student.keySet());

        // values() returns a Collection containing all values
        System.out.println(student.values());

        // entrySet() returns a Set containing all key-value entries
        System.out.println(student.entrySet());
    }
}