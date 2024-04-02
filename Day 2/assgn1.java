import models.Circle;
import models.Cylinder;

public class assgn1 {
    public static void main(String[] args) {
        Circle[] circles = {
                new Cylinder(12.34),
                new Cylinder(12.34, 10.0),
                new Cylinder(12.34, 10.0, "blue")
        };

        for (int i = 0; i < 3; i++) {
            Cylinder cylinder = (Cylinder) circles[i];
            System.out.printf("For cylinder %d: Area of the circular region = %.2f, Volume of the cylinder = %.2f\n", 
                              i + 1, cylinder.getArea(), cylinder.getVolume());
        }


    }
}