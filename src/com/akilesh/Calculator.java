package com.akilesh;

public class Calculator {

    private final Floor floor;
    private final Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = this.floor.getArea();
        double cost = this.carpet.getCost();
        return (area * cost);
    }
}
