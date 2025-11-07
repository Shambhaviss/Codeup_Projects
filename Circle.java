import java.util.Scanner;

//class circle inherits from class shape
class Circle extends Shape {
    float radius;
    Circle(float radius) { this.radius = radius; }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
