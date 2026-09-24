package String;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb);
        System.out.println(sb.append("Manas"));
        System.out.println(sb.replace(6,11,"Asish"));
        System.out.println(sb.delete(6,11));
        System.out.println(sb.insert(6,"Manas"));
        System.out.println(sb.reverse());
    }
}
