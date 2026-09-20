package Array;

import java.util.Scanner;

class Student{
    int roll;
    String branch,name;

    //set student details
    public void setStudent(int roll,String name,String branch){
        this.roll=roll;
        this.name=name;
        this.branch=branch;
    }

    //get Student details
    public void getStudent(){
        System.out.println("Name :"+this.name+" Roll :"+this.roll+" Branch :"+this.branch);
    }
}
public class arrayObject {
    public static void main(String[] args) {

        //create 3an array for 3 student object
        Student arr[]=new Student[3];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 student Details");
        for(int i=0;i<3;i++){
            System.out.println("Enter Details of student "+(i+1));
            System.out.println("Enter Roll :");
            int roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name :");
            String name=sc.nextLine();
            System.out.println("Enter Branch :");
            String branch=sc.nextLine();

            //create student object
            arr[i]=new Student();
            //set Student details
            arr[i].setStudent(roll, name, branch);
        }
        //print details of all student
        for(Student s:arr){
            //get student details through student object
           s.getStudent();
        }
        sc.close();
    }
}
