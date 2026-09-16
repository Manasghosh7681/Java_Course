public class constant{
    final int a=10;
    final static int b=20;


    //Blank final instance variable need to initialize through constructor
    final int c;
    constant(int x){
        this.c=x;
    }

    /*Note :Blank final instance variable we can not initialize through normal concret method */

    //static constant initialization
    final static int d;
    static{
        d=50;
    }

    public static void main(String[] args) {
        System.out.println("Static Constant :"+b);
        constant c1=new constant(40);
        System.out.println("Non-static constant :"+c1.a);
        System.out.println("Constant initialization through constructor :"+c1.c);
        System.out.println("Static constatnt initialization value :"+d);
    }
}