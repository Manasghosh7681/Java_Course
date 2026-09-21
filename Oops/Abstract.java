package Oops;
abstract class Car{
    abstract void start();
    public void stop(){
        System.out.println("Car stop");
    }
}
public class Abstract extends Car {
    public void start(){
        System.out.println("Car started");
    }
    public static void main(String[] args) {
        Abstract a1=new Abstract();
        a1.start();
        a1.stop();
    }
}
