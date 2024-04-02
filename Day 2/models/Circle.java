package  models;

public class Circle{
    private double r = 1.00;
    private String c = "red";

    public Circle(){
    }
    public Circle(double r){
        this.r = r;
    }
    public Circle(double r,String c){
        this.r = r;
        this.c =c;
    }
    public double getr() {
        return this.r;
    }
    public void setr(double r) {
        this.r = r;
    }
    public String getc() {
        return this.c;
    }
    public void setc(String c) {
        c = c.trim();
        this.c = c;
    }
    public double getArea(){
        double r = this.getr();
        return Math.PI*Math.pow(r, 2);
    }
    public String toString() {
        return "Circle[radius = "+ this.r+",color = "+this.c+"]";
    }
}