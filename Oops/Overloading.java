package Oops;
class Operation{
    public int add(int a){
        return a+100;
    }
    public int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b,float c){
        return a+b+c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Operation o =new Operation();
        System.out.println(o.add(10));
        System.out.println(o.add(10,20));
        System.out.println(o.add(10.0f,20.0f,34.5f));
    }
}
