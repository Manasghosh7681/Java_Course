package Array;

public class oneDimensionalArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //print array through foreach
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
