package Array;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float arr[]=new float[5];
        System.out.println("Enter 5 element into the array :");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextFloat();
        }
        sc.close();
        //print array through foreach
        for(float value:arr){
            System.out.print(value+" ");
        }
    }
}
