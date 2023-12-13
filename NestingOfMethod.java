package OopsProgramLevel2;

import java.util.Scanner;

public class NestingOfMethod {
    static NestingOfMethod ob = new NestingOfMethod();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double length = sc.nextInt();
        System.out.println("Enter breadth");
        double breadth = sc.nextInt();
        System.out.println("Enter height");
        double height = sc.nextInt();
        ob.Volume(length, breadth, height);
    }
    public void Volume(double l, double b, double h)
    {
        double volumeOfCuboid = l*b*h;
        System.out.println("Volume of cuboid: " + volumeOfCuboid);
        ob.Area(l, b, h);
    }
    public void Area(double l, double b, double h)
    {
        double areaOfCuboid =  2 *(l*b + b*h + l*h);
        System.out.println("Area of cuboid: " + areaOfCuboid);
        ob.Perimeter(l, b, h);
    }
    public void Perimeter(double l, double b, double h)
    {
        double perimeterOfCuboid = 4*( l + b + h);
        System.out.println("Perimeter of cuboid: " + perimeterOfCuboid);
    }
}
