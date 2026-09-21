package Oops;
class A{
    public void show(){
        System.out.println("A");
    }
}
class Overriding extends A{
    @Override
    public void show(){
        System.out.println("B");
    }
    public static void main(String args[]){
        Overriding b1=new Overriding();
        b1.show();           //Output :B
    }
}


