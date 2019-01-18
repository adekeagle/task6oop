package model;

import exceptions.TriangleException;
import validators.IsTriangleOk;

public class Triangle extends Rectangle {

    IsTriangleOk isTriangleOk = new IsTriangleOk();
    private double siteC;

    public Triangle(double siteA, double siteB, double siteC) {
        super(siteA, siteB);
        this.siteC = siteC;

        checkIsOk(siteA, siteB, siteC);
    }

    @Override
    public double getArea()
    {
        return Math.sqrt(HeronFormula());
    }

    @Override
    public double getCircuit()
    {
        return siteA + siteB + siteC;
    }

    private double HeronFormula()
    {
        //Half Circuit
        double halfCircuit = getCircuit() / 2;
        //Heron's Formula
        return halfCircuit*(halfCircuit - siteA) * (halfCircuit - siteB) * (halfCircuit - siteC);
    }

    //Check triangle from deffinition
    private void checkIsOk(double siteA, double siteB, double siteC) {
        try
            {
                boolean isTrue = isTriangleOk.IsTriangleDefOk(siteA, siteB, siteC);
                if(isTrue){
                    System.out.println("Trójkąt ok");
                }
            } catch (TriangleException e) {
                e.printStackTrace();
        }
    }

}
