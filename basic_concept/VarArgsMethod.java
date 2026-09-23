class Calculate{
    public void add(int... a) {
    int res = 0;
    for (int arg : a) {
        res += arg;
    }
    System.out.println(res);
}
}

public class VarArgsMethod {
    public static void main(String[] args) {
        Calculate c=new Calculate();
        c.add(1);
        c.add(1, 2);
        c.add(1, 2, 3);
        c.add(1, 2, 3, 4);
    }
}
