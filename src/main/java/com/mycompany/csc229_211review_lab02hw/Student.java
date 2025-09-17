package com.mycompany.csc229_211review_lab02hw;

/**
 *

 @author MoaathAlrajab*/
public class Student extends Person { // Student class inherits from Person in order to become a child class of Person


    private String address; // bring over address & gpa in order to use in gettor and settor
    private double gpa;

    public Student(String name, int age){ // bring the super constructor over from constructor that takes only two paras
        super(name, (short) age);
    }
    @Override // override abstract methods from Person class
    public String getAddress(){
        return address;
    }
    @Override // override abstract methods from Person class
    public  void setAddress(String address){
        this.address = address;
    }

    public double getGpa(){ // gettor for gpa
        return gpa;
    }

    public void setGpa(double gpa){ // settor for gpa
        this.gpa = gpa;
    }



}
