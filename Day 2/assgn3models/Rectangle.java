package assgn3models;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){
    }

    public Rectangle(double width,double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        if (width<=0){
            throw new Error("Width should be greater than zero");
        }
        else if(length<=0){
            throw new Error("Length should be greater than zero");
        }

        this.length = length;
        this.width = width;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new Error("Width should be greater than 0") ;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if(length <=0 ){
            throw new Error("Length should be greater than 0");
        }
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+
                width+ " and length = "+length+
                " ,Which is a subclass of "+ super.toString();
    }
}
