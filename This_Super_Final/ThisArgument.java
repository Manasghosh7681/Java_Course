package This_Super_Final;

class Teacher {
    public void showStudent(Student s1) {
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student {
    int roll, age;
    String name;

    Student(int roll, int age, String name) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public void sendStudentDetails() {
        Teacher t1 = new Teacher();
        t1.showStudent(this);

    }
}

public class ThisArgument {
    public static void main(String[] args) {
        Student s1 = new Student(101, 23, "Manas Ghosh");
        s1.sendStudentDetails();
    }
}
