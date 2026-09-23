package Packages.Student;

import Packages.Employee.Employee;

public class College {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo(101, 89, "Manas Ghosh");
        Display d1 = new Display();
        d1.show(s1);
        Employee e1=new Employee();
        e1.employee("Asish Kumar Nayak");
        System.out.println("Total Member "+StudentDemo.count);
    }
}
