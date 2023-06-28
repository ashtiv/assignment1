package com.example;

public class Engineer extends Employee{
    private double benefits;
    public Engineer(String name,double baseSalary,double gratuity,long joiningDate,double benefits){
        super(name,baseSalary,gratuity,joiningDate);
        this.benefits=benefits;
    }
    public void displayTotalSalary(){
        System.out.println("Total salary is: " + (super.baseSalary+super.gratuity+benefits) + " per month");
    }
    public void displayEmployeeRole(){
        System.out.println("I am an instance of type Engineer, I build stuff!");
    }
}
