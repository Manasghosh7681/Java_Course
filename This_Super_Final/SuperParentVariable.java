package This_Super_Final;
class Person{
    String name;

}
class Employee extends Person{
    Employee(String name){
        super.name=name;
    }
}
public class SuperParentVariable {
    public static void main(String[] args) {
        Employee e1=new Employee("Manas Ghosh");
        System.out.println(e1.name);
    }
}
