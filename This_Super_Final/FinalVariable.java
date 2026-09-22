package This_Super_Final;
class Abc{
    final float PI=3.14f;
    public final void display(){
        System.out.println("THis is a Final method");
    }
}
class Xyz extends Abc{
    
    // public void display(){  //we can not override final method

    // }
    // public void assignValue(){
    //     super.PI=3.24f; //Final field PI can not be assigned
    // }
}

public class FinalVariable {
    public static void main(String[] args) {
        // Abc a1=new Abc();
        // a1.
    }
}
