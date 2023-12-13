package OopsProgramLevel2;

import java.util.Scanner;

public class AreaByOverLoading {
    public static void main(String[] args) {
        AreaByOverLoading ob = new AreaByOverLoading();
        ob.AreaCalculation(10.76);
        ob.AreaCalculation(10.34, 15);
        ob.AreaCalculation(18);
    }
    public void AreaCalculation(double l)
    {
        System.out.println("Area of square: " + l*l);
    }
    public void AreaCalculation(double l, double b)
    {
        System.out.println("Area of rectangle: " + l*b);
    }
    public void AreaCalculation(int r)
    {
        System.out.println("Area of cirle: " + 2*Math.PI*r);
    }
}
