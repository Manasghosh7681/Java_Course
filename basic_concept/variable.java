class Variable{
    int a=10,b=20,res;// Instance variable
    static int defaultValue; //static variable
    public void add(){
        int z=40;//local variable
        res=a+b;
        defaultValue=res;
        System.out.println("Local Variable :"+z);
    }
    public void display(){
        System.out.println("Instance Variable :"+a+","+b);
        System.out.println("Addition of Instance variable :"+res);
        System.out.println("Static variable :"+defaultValue);
        // System.out.println("Value of Z :"+z); local variable can not be access here
    }

    public static void main(String args[]){
        Variable v1=new Variable();
        v1.add();
        v1.display();
        Variable v2=new Variable();
        v2.display();
        
    }
}