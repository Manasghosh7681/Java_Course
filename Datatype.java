public class Datatype {
    public static void main(String[] args) {
        byte a=10;
        System.out.println("Size of Byte and it\'s type :"+(((Object)a).getClass().getName())+" ,"+Byte.BYTES);
        short b=2;
        System.out.println("Size of Short and it\'s type :"+((Object)b).getClass().getName()+" ,"+Short.BYTES);
        int c=100;
        System.out.println("Size of Integer and it\'s type :"+((Object)c).getClass().getName()+" ,"+Integer.BYTES);
        long d=100l;
        System.out.println("Size of Long and it\'s type :"+((Object)d).getClass().getName()+" ,"+Long.BYTES);
        float f=10.90f;
        System.out.println("Size of Float and it\'s type :"+((Object)f).getClass().getName()+" ,"+Float.BYTES);
        double g=10.00;
        System.out.println("Size of Double and it\'s type :"+((Object)g).getClass().getName()+" ,"+Double.BYTES);
        char h='m';
        System.out.println("Size of Character and it\'s type :"+((Object)h).getClass().getName()+" ,"+Character.BYTES);
        boolean i=true;
        System.out.println("Boolean type :"+((Object)i).getClass().getName());
        // Datatype d1=new Datatype();
        // System.out.println(d1.getClass().getName());

    }
}
