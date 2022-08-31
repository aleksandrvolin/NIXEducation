package com.ua.task1;

public class ContractStudent extends Student {

    private double cost;

    public ContractStudent() {
    }

    public ContractStudent(String name, int age, double cost) {
        super(name, age);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
