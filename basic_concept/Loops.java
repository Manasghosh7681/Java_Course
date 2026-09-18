public class Loops {
    public static void main(String[] args) {
        //print 1 to 10 through while loop
        int i=0;
        while(i<10){
            System.out.println(i+1);
            i++;
        }

        //print 1 to 10 using for loop
        for(int j=1;j<=10;j++){
            System.out.println(j);
        }

        //print 1 to 10 through do while loop
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<10);
        

        //print array value through for each loop
        int arr[]={10,20,30,40,50};
        for (int l : arr) {
            System.out.println(l);
        }
    }
}
