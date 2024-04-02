package models;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name,String address,String school,double pay){
        super(name,address);
        this.pay = pay;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        school = school.trim();
        if(school.isEmpty()) {
            throw new Error("school can't be empty");
        }
        this.school = school;
    }

    public void setPay(double pay) {
        if(pay<0){
            throw new Error("pay can't be negative");
        }
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff["+super.toString()+" school="+this.school+" pay= "+this.pay+"]";
    }
}
