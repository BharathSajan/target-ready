package assgn3models;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double radius = this.getRadius();
        return Math.PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        double radius = this.getRadius();
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = "  + radius  + " is a subclass of"+ super.toString();
    }

}
