package Oops;

class Addition {
    public int add(int a, int b) {
        System.out.println("GrandParent");
        return a + b;
    }
}

class Multiplication extends Addition {

    public int Mul(int a, int b) {
        System.out.println("Parent");
        return a * b;
    }
}

class Division extends Multiplication {
    public int Div(int a, int b) {
        System.out.println("Child");
        return a / b;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(10, 20)); // GrandParent call
        Multiplication m1 = new Multiplication();
        System.out.println(m1.add(20, 30)); // GrandParent call
        System.out.println(m1.Mul(10, 2)); // parent call
        Division d1 = new Division();
        System.out.println(d1.add(10, 20)); // grandParent call
        System.out.println(d1.Mul(10, 20)); // Parent call
        System.out.println(d1.Div(10, 2)); // Child call
    }
}
