package Oops;
class Animal{
    public void show(){
        System.out.println("Animal");
    }
    public void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog eat");
    }
    public void bark(){
        System.out.println("Dog bark");
    }
}
public class Upcasting{
    public static void main(String args[]){
        Animal a=new Dog();
        a.show();   //Animal
        a.eat();     //Dog eat
        
    }
}


