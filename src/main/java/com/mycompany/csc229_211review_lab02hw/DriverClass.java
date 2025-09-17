package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner; // import scanner so we can take inputs from user and use them in gettor and settor

/**
 *

 @author MoaathAlrajab*/
public class DriverClass {

    public static void main(String[] args) {

        Student std1= new Student("James", 20); // create student object w/ parameters name and age

        Scanner scnr = new Scanner(System.in); // initialize the scanner so we can take inputs from user

        System.out.println("Enter GPA for " + std1.getName() + ": "); // prompt the end-user for GPA
        double gpa = scnr.nextDouble(); // store input as a double value

        std1.setGpa(gpa); // use input in the settor

        System.out.println(std1); // print std1 as output



    }

}
