package model;

public class Rectangle extends Figure {

    protected double siteB;

    public Rectangle(double siteA, double siteB) {
        super(siteA);
        this.siteB = siteB;
    }

    @Override
    public double getArea() {
        return siteA * siteB;
    }

    @Override
    public double getCircuit(){
        return 2 * (siteA + siteB);
    }
}
