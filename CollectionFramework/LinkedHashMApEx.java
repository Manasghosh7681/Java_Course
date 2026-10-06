package CollectionFramework;
import java.util.LinkedHashMap;
public class LinkedHashMApEx {
    public static void main(String[] args) {
        LinkedHashMap<String,Float> Product=new LinkedHashMap<>();
        //put()
        Product.put("Keyboard",576.00f);
        Product.put("Mouse",900.0f);
        Product.put("Laptop", 65000.67f);
        System.out.println(Product);
        
        LinkedHashMap<String,Float> grocery=new LinkedHashMap<>();
        grocery.put("Potato",45.0f);
        grocery.put("Oil",90.90f);
        //putAll()
        Product.putAll(grocery);

        //get()
        System.out.println(Product.get("Laptop"));

        //getOrDefault()
        System.out.println(Product.getOrDefault("Mouse",50.0f));

        //containsKey()
        System.out.println(Product.containsKey("Oil"));

        //containsValue()
        System.out.println(Product.containsValue(65000.09f));

        //replace()
        Product.replace("Keyboard",2300.09f);

        //replaceAll()
        Product.replaceAll((key,value)->value+100);

        //keySet()
        System.out.println(Product.keySet());

        //values()
        System.out.println(Product.values());

        //entrySet
        System.out.println(Product.entrySet());
    }
}
