package This_Super_Final;
class Employee{
    int empId;
    String empName;
    float empSal;
    Employee(int empId){
       this.empId=empId;
    }
    Employee(String empName,float empSal,int empId){
        this(empId);                //constructor call must be the first line inside a constructor.A constructor can not be invoke inside a method
        this.empName=empName;
        this.empSal=empSal;
        this.showEmployee();
    }
    public  void showEmployee(){
        System.out.println(this.empId+"\n"+this.empName+"\n"+this.empSal);
    }
    
}

public class ThisInvokeConstructor {
    public static void main(String[] args) {
        new Employee("Manas Ghosh",350000.0f,1423);
    }
}
