package Oops;
class A{
    int roll;
    int age;
    public void display(String name){
        System.out.println("Hello "+name);
    }
}
class B extends A{
    B(int roll){
        super.roll=roll;
    }
    public void display(){
        System.out.println("Roll "+super.roll);
    }
}
class C extends A{
    C(int age){
        super.age=age;
    }
    public void display(){
        System.out.println("Age "+super.age);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        B b1=new B(101);
        b1.display("Manas");
        b1.display();
        C c1=new C(23);
        c1.display("Asish");
        c1.display();
    }
}
