package models;

public class Cylinder extends Circle{
    
        private double h=1.0;
        public Cylinder(){
        }
        public Cylinder(double r){
            this.setr(r);
        }
        public Cylinder(double r,double h){
            this.setr(r);
            this.h = h;
        }
        
        public Cylinder(double r,double h,String c){
            this.setr(r);
            this.h = h;
            this.setc(c);
        }
        public double geth() {
            return this.h;
        }
        public void seth(double h) {
            this.h = h;
        }
        public double getVolume(){
            return 2*Math.PI*this.getr()*this.geth();
        }
    } 
