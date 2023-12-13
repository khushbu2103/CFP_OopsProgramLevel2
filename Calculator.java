package OopsProgramLevel2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Calculator ob = new Calculator();
        ob.Input();
    }
    public void Input()
    {
        Calculator ca = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digit");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of two digits is: " + ca.Add(num1, num2));
    }
    public int Add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

}
