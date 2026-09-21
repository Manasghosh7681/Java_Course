package Array;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,20,20};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 20)); //return the position
        
        int copyArr[]=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copyArr));
        System.out.println(Arrays.equals(arr, copyArr));    //it return boolean
        
        int dumyArr[]=new int[5];
        Arrays.fill(dumyArr,10);
        System.out.println(Arrays.toString(dumyArr));

        System.out.println(arr.length);
    }
}
