package This_Super_Final;
class Abc{
    int roll,age;
    String name;
    Abc(int roll,int age){
        this.roll=roll;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class ThisInstanceVariable {
    public static void main(String[] args) {
        Abc a1=new Abc(101,23);
        a1.setName("Manas Ghosh");
        System.out.println(a1.name);
        System.out.println(a1.age);
        System.out.println(a1.roll);
    }
}
