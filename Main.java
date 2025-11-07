import java.util.Scanner;

 // Main method
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter y1: ");
        float y1 = sc.nextFloat();
        Point p1 = new Point(x1, y1);

        System.out.println("Enter x2: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter y2: ");
        float y2 = sc.nextFloat();
        Point p2 = new Point(x2, y2);

        System.out.println("Distance: " + p1.distance(p2));

        System.out.println("Enter dx for translation: ");
        float dx = sc.nextFloat();
        System.out.println("Enter dy for translation: ");
        float dy = sc.nextFloat();

        p1.translate(dx, dy);
        System.out.println("Point after translation: " + p1);

        System.out.println("Enter radius of circle: ");
        float radius = sc.nextFloat();
        Circle c = new Circle(radius);
        System.out.println("Area of Circle: " + c.getArea());

        System.out.println("Enter side of square: ");
        float side = sc.nextFloat();
        Square s = new Square(side);
        System.out.println("Area of Square: " + s.getArea());

        sc.close();
    }
 }