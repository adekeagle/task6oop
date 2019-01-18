package model;

public class Square extends Figure {

    public Square(double siteA) {
        super(siteA);
    }

    @Override
    public double getArea(){
        return Math.pow(siteA, 2);
    }

    @Override
    public double getCircuit(){
        return 4 * siteA;
    }
}
