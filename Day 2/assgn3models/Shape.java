package assgn3models;

public abstract class Shape {
    private String Color;
    private boolean filled;
    public Shape(){
        this.Color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.Color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    @Override
    public String toString() {
        String s = "A Shape with color " + this.Color + " and ";
        if(this.filled){
            return s+"filled.";
        }

        return s+"not filled.";
    }
    
}