package Packages.Student;

public class StudentDemo {
    public static int count=0;
    int roll,mark;
    String name;
    public StudentDemo(int roll,int mark,String name){
        this.roll=roll;
        this.mark=mark;
        this.name=name;
        count+=1;
    }
}
class Display {

    public void show(StudentDemo s){
        System.out.println(s.roll+"\n"+s.mark+"\n"+s.name);
    }
}
