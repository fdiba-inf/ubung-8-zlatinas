package exercise8;
import java.util.Scanner;

public class Point {
  
    // Define attributes
    double x, y;

    public Point() {
        // Initialize attributes to 0
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x += xDelta;
        y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        Point a = new Point();
        a.x = xDelta + x; 
        a.y = yDelta + y; 

        return a;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        if (this.x == otherPoint.x && this.y ==otherPoint.y ){
          return true;
        } else
         return false;
    }
    public String toString() {
        // Represent attributes as string
        String b = "(" + this.x + ", " + this.y + ")";
        return b;
    }
}
