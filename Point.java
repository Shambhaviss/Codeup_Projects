import java.util.Scanner;

public class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // Distance between this point and another
    public double distance(Point other) {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Move the point by dx and dy
    public void translate(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}



