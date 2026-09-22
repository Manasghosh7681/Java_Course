package This_Super_Final;
class Person{
    String name,email,phone;
    Person(String name,String email,String phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    
}
class Employee extends Person{
    int empId;
    String Dept,design;
    Employee(int empId,String Dept,String design,String name,String email,String phone){
        super(name,email,phone);
        this.empId=empId;
        this.Dept=Dept;
        this.design=design;
    }
    public void getEmployeeDetails(){
        System.out.println(super.name+"\n"+super.email+"\n"+super.phone+"\n"+this.empId+"\n"+this.Dept+"\n"+this.design);
    }
}

public class SuperInvokeConstructor {
    public static void main(String[] args) {
        Employee e1=new Employee(123, "Developer", "PHP", "Manas Ghosh", "manasghosh923@gmail.com", "7681803732");
        e1.getEmployeeDetails();
    }
}
