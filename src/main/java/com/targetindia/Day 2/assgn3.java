import assgn3models.Circle;
import assgn3models.Rectangle;
import assgn3models.Shape;
import assgn3models.Square;

public class assgn3 {
        public static void main(String[] args) {
    
                Shape[] shapes = {
                        new Rectangle(),
                        new Rectangle(2,4),
                        new Rectangle(5,12),
                        new Circle(),
                        new Circle(8),
                        new Circle(7,"black",false),
                        new Circle(29,"green",true),
                        new Square(52),
                        new Square(3.5,"white",false),
                        new Square(42)
                };
    
    
            for (int i = 0; i < 10; i++) {
                System.out.printf("For shape %d : Perimeter of the Shape is = %f and Area of the Shape is = %f",i+1, shapes[i].getPerimeter(),shapes[i].getArea());
                System.out.println();
            }
    
        }
}
