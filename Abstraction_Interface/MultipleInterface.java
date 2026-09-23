package Abstraction_Interface;
interface Camera{
    void takePhoto();
}
interface Music{
    void playMusic();
}
class Smartphone implements Camera,Music{
    public void takePhoto(){
        System.out.println("Taking photo");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Smartphone s1=new Smartphone();
        s1.takePhoto();
        s1.playMusic();
    }
}
