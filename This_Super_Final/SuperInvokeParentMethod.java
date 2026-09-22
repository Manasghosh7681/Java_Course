package This_Super_Final;
class Employee{
    int basicSal=15000;
    float salary;
    public float calculateSalary(int totalDays){
        
        this.salary=(this.basicSal/30)*totalDays;
        return salary ;
    }
}

class Manager extends Employee{
    public void revisedSalary(int totalDays){
        if(super.calculateSalary(totalDays)<10000){
            super.salary+=2000;
        }
    }
}

public class SuperInvokeParentMethod {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.revisedSalary(15);
        System.out.println("Salary :"+m1.salary);
    }
}
