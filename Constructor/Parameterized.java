package Constructor;
class abc{
    String name;
    abc(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(this.name);
    }
}
public class Parameterized {
    public static void main(String[] args) {
        abc a1=new abc("Manas");
        a1.display();
    }
}
