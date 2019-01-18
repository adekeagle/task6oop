package model;

import interfaces.Definition;

public class Figure implements Definition {

    protected double siteA;

    public Figure(double siteA) {
        this.siteA = siteA;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircuit() {
        return 0;
    }
}
