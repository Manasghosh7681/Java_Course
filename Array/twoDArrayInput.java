package Array;

import java.util.Scanner;

public class twoDArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][2];
        System.out.println("Enter element intp 2*2 matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //print matrix through foreach
        for(int row[]:arr){
            for(int value:row){
                System.out.print(value+" ");
            }
            System.out.println(); //for new line after a row
        }
        sc.close();
    }
}
