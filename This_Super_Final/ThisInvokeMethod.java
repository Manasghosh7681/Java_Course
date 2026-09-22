package This_Super_Final;
class Student{
    int roll,age;
    String name;
    float cgpa;
    Student(String name,int roll,int age,float cgpa){
        this.name=name;
        this.setStudentDetail(roll,age,cgpa);

    }
    public void setStudentDetail(int roll,int age,float cgpa){
        this.roll=roll;
        this.age=age;
        this.cgpa=cgpa;
        System.out.println(this.getStudentDetail());
    }
    public String getStudentDetail(){
        System.out.println("Student Details");
        return this.name+"\n"+this.age+"\n"+this.roll+"\n"+this.cgpa;
    }
}

public class ThisInvokeMethod {
    public static void main(String[] args) {
        new Student("Manas Ghosh", 101, 23, 9.4f);
    }
}
