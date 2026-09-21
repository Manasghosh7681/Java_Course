
abstract class abc{
    abstract public void show();
    public final void reuse(){
        System.out.println("Final method");
    }
}
class Example extends abc{
    public void display(){
        System.out.println("THis is instance method");
    }
    public static void print(){
        System.out.println("This is statis method");
    }
    public void show(){
        System.out.println("THis is abstract method implementation");
    }
    // @Override 
    // public final void reuse(){      //can not override final metod error

    // }
}

public class Methods {
    public static void main(String[] args) {
        Example e1=new Example();
        e1.display();
        Example.print();
        e1.show();
        e1.reuse();
    }
}
