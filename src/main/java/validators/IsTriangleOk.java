package validators;

import exceptions.TriangleException;

public class IsTriangleOk {

    public IsTriangleOk() {
    }

    public boolean IsTriangleDefOk(double siteA, double siteB, double siteC) throws TriangleException {
        if(!checkDefinitionTriangle(siteA, siteB, siteC)) {
            throw new TriangleException("Z podanych długości nie można stworzyć trójkąta");
        }

        return true;
    }

    private boolean checkDefinitionTriangle(double siteA, double siteB, double siteC){
        if((siteA + siteB > siteC) && (siteB + siteC > siteA) && (siteC + siteA > siteB))
            return true;
        else
            return false;
    }
}
