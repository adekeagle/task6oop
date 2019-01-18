package model;

public class Rhombus extends Figure {

    private double heightB;

    public Rhombus(double siteA, double heightB) {
        super(siteA);
        this.heightB = heightB;
    }

    @Override
    public double getArea() {
        return siteA * heightB;
    }

    @Override
    public double getCircuit(){
        return 4 * siteA;
    }
}
