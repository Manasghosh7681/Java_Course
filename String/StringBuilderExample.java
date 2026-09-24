package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Happy ");
        System.out.println(sb);
        System.out.println(sb.append("Manas"));
        System.out.println(sb.replace(6,11,"Asish"));
        System.out.println(sb.delete(6,11));
        System.out.println(sb.insert(6,"Manas"));
        System.out.println(sb.reverse());
    }
}
