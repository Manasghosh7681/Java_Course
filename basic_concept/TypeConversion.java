public class TypeConversion {
    public static void main(String[] args) {
        //Widening type casting
        byte b=10;
        short s=b;
        int i=b;
        long l=b;
        float f=b;
        double d=b;
        
        System.out.println(b+"\n"+s+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n");
        //Narrowing Type casting
        double a=10.0d;
        byte c=(byte)a;
        short e=(short)a;
        int g=(int)a;
        long h=(long)a;
        float j=(float)a;
        System.out.println(a+"\n"+c+"\n"+e+"\n"+g+"\n"+h+"\n"+j);

        
    }
}
