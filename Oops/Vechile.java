package Oops;
public class Vechile{
    float speed;
    String color;

    public void start(){
        System.out.println("Vechile Start with speed "+this.speed);
    }
    public void end(){
        System.out.println("Vechile Stop with color "+this.color);
    }
}
class Main{
   public static void main(String[] args) {
    Vechile v1=new Vechile();
    v1.speed=190;
    v1.color="Black";
    v1.start();
    v1.end();
   }
}