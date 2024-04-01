package assgn3models;

public class Square extends Rectangle{
    public Square(){
        this.setLength(1.0);
        this.setWidth(1.0);
    }
    public Square(double side){
        if(side <=0){
            throw new Error("side must be positive");
        }
        this.setWidth(side);
        this.setLength(side);
    }

    public Square(double side,String color,boolean filled){
        this.setLength(side);
        this.setWidth(side);
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double width) {
            super.setWidth(width);
            super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "+ this.getSide() +
                " ,which is a subclass of "+ super.toString();
    }
}