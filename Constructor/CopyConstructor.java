package Constructor;
class abc{
    int roll;
    String name;
    abc(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    abc(abc a1){
        this.name=a1.name;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        abc a1=new abc(101,"Manas Ghosh");
        abc a2=new abc(a1);
        System.out.println(a1.name);
        System.out.println(a2.name);
    }
}
