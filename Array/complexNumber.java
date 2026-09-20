package Array;

import java.util.Scanner;

class Number{
    int real,imaginary;

    //constructor to initialize object
    Number(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    //method that add 2 comple number and store for current object
    public void addNumber(Number n1,Number n2){
        this.real=n1.real+n2.real;
        this.imaginary=n1.imaginary+n2.imaginary;
     
        
    }

    //it call automatically when an object is print
    public String toString(){
        return this.real+"+i"+this.imaginary;
    }
}
public class complexNumber {
    public static void main(String[] args) {

        //create an array for 2 complex number
        Number arr[]=new Number[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 complex for addition");
        for(int i=0;i<2;i++){
            System.out.println("Enter number "+(i+1));
            System.out.println("Enter real number :");
            int real=sc.nextInt();
            System.out.println("Enter imginary number :");
            int img=sc.nextInt();
            //initialize object
            arr[i]=new Number(real,img);
        }
        //it call toString() automatically
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //add 2 complex number and store arr[1] object
        arr[1].addNumber(arr[0],arr[1]);
        System.out.println(arr[1]);
        sc.close();
    }

}
