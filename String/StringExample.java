package String;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
        System.out.println(s1.getClass().getName());
        System.out.println(s1.hashCode()+" " +s2.hashCode()); //both string object have same hashcode because they are create in string constant pool

        String s3=new String("Hello");
        System.out.println(s1==s3);     //false
        System.out.println(s1.hashCode()+" " +s3.hashCode()); //here not same because s1 create in string constant pool and s3 create inside heap memory

        //String is immutable
        /*Here we try to modify s1 but it's value not change a new object is created and it's reference is s4 */
        String s4=s1.concat("!");
        System.out.println(s1);         //hello
        System.out.println(s4);         //hello!

        //String Method
        String s="Hello World";
        System.out.println(s.length());
        String nw=s.concat("!");
        System.out.println(nw);
        System.out.println(s.indexOf('H'));
        System.out.println(s.contains("Hello"));
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World"));
        String rs=s.replace('H','G');
        System.out.println(rs);
        String up=s.toUpperCase();
        System.out.println(up);
        String lc=s.toLowerCase();
        System.out.println(lc);
        System.out.println(s.equals(lc));
        System.out.println(s.trim());
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(String.join("-",arr));
        
    }
}
