package models;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name,String address,String program,int year,double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setProgram(String program) {
        program = program.trim();
        if(program.isEmpty()){
            throw new Error("Program can't be empty");
        }
        this.program = program;
    }

    public void setFee(double fee) {
        if(fee<0){
            throw new Error("Fee can't be negative");
        }
        this.fee = fee;
    }

    public void setYear(int year) {
        if(year<0){
            throw new Error("Year can't be negative");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student["+ super.toString()+" program="+ this.program+" year="+this.year+" fee="+this.year+"]";
    }
}