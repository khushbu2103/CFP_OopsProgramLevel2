package OopsProgramLevel2;

import java.util.Scanner;

public class AreaOfTriangleAndRectangle {
    public static void main(String[] args) {
        AreaOfTriangleAndRectangle ob = new AreaOfTriangleAndRectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        System.out.println("Area of triangle: " + ob.Triangle(length, breadth));
        System.out.println("Area of rectangle: " + ob.Rectangle(length, breadth));
    }
    public double Triangle(double l, double b)
    {
        double areaOfTriangle = 0.5*l*b;
        return areaOfTriangle;
    }
    public double Rectangle(double l, double b)
    {
        double areaOfRectangle = l*b;
        return areaOfRectangle;
    }
}
