public class Operator {
    public static void main(String[] args) {
        //Arithmetic Operator
        int a=30,b=20;
        System.out.println("Sum of 2 num :"+(a+b));
        System.out.println("Difference of 2 num :"+(a-b));
        System.out.println("Multiplication of 2 num :"+(a*b));
        System.out.println("Division of 2 num :"+(a/b));
        System.out.println("Modulo Division of 2 num :"+(a%b));

        //Relational Operator
        System.out.println("A is greater then B :"+(a>b));
        System.out.println("A is less then B :"+(a<b));
        System.out.println("A is greater then equlato B :"+(a>=b));
        System.out.println("A is less then equlato B :"+(a<=b));
        System.out.println("A is  equlato B :"+(a==b));
        System.out.println("A is  Not equlato B :"+(a!=b));

        //Logical AND Operator
        int c=30,d=40,e=50;
        if((c>d)&&(c>e)){
            System.out.println("C is greatest .");
        }else if((d>c)&&(d>e)){
            System.out.println("D is greatest .");
        }else{
            System.out.println("E is greatest .");
        }

        // Logical OR operator
        int year=1904;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Year is leap year");
        }else{
            System.out.println("Year is not a leap year");
        }

        //Unary Operator
        int x=2,y=4;
        int z=x++ + y++; //2+4
        System.out.println(z+","+x+","+y);
        x=2;
        y=4;
        z=++x + ++y; //3+5
        System.out.println(z+","+x+","+y);

        x=2;y=4;
        z=x++ + x++ + ++x + y++ + ++y; // 2+3+5+4+6
        System.out.println(z+","+x+","+y);

        x=2;y=4;
        z=x-- + y--; //2+4
        System.out.println(z+","+x+","+y);
        x=2;y=4;
        z=x-- + --x; //2 +0
        System.out.println(z+","+x+","+y);
        x=2;y=4;
        z=y-- + --y + x-- + --x; //4+2+2+0
        System.out.println(z+","+x+","+y);

        //Ternary Operator
        int res=(6>8)? 6:8;
        System.out.println("Res :"+res);

        //Bitwise Operator
        int p=4,q=6;
        /* p=0100
           q=0110
        */ 
        System.out.println(p&q); //0100=4
        System.out.println(p|q); //0110=6
        System.out.println(p<<3); //0100000=32
        System.out.println(q>>2); //0001=1
    }
}
