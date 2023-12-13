package OopsProgramLevel2;

public class ArithmeticSum {
    public static void main(String[] args) {
        ArithmeticSum ob = new ArithmeticSum();
        ob.Addition(10, 20);
        ob.Addition(10, 20, 30);
        ob.Addition(2.9, 15, 25);
        ob.Addition(10, 3.76, 20);
    }
    public void Addition(int a, int b)
    {
        System.out.println(a+b);
    }
    public void Addition(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public void Addition(double a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public void Addition(int a, double b, int c)
    {
        System.out.println(a+b+c);
    }

}
