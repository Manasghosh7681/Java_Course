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
    public void eat(){
        System.out.println("Dogs eat");
    }
    public void bark(){
        System.out.println("Dogs bark");
    }
}
class DownCasting{
    public static void main(String args[]){
        Animal a=new Dog();     //Upcasting
        a.show();    //Animal
        a.eat();     //Dog eat

        Dog d=(Dog) a;  //Dow casting Animal reference (a) is convert into Dog reference (d)
        d.show();   //Animal
        d.eat();    //Dogs eat
        d.bark();   //Dogs bark
    }
}

