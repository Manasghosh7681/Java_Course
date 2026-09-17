public class wrapper {
    public static void main(String[] args) {
        int a=10;
        Integer obj=Integer.valueOf(a);
        Integer ob=a;       //Autoboxing
        System.out.println(obj.getClass().getName()+" ,"+obj);
        System.out.println(ob.getClass().getName());
        int b=obj; //unboxing
        System.out.println(b);

    }
}
