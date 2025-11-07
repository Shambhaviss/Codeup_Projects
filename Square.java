import java.util.Scanner;

//class square inherits from class shape
class Square extends Shape {
    float side;
    Square(float side) { this.side = side; }

    @Override
    public double getArea() {
        return side * side;
    }
}
