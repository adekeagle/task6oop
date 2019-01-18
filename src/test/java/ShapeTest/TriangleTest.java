package ShapeTest;

import model.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TriangleTest implements FigureTest {

    private Triangle triangle;

    @BeforeEach
    void setUp()
    {
        triangle = new Triangle(3, 3, 3);
    }

    @Test
    public void getAreaOk() {
        final double vAreaOk = 3.897114317029974;

        final double result = triangle.getArea();

        assertEquals(result, vAreaOk);
    }

    @Test
    public void getAreaNotOk() {
        final double vAreaNotOk = 13.897114317029974;

        final double result = triangle.getArea();

        assertNotEquals(result, vAreaNotOk);
    }

    @Test
    public void getCircuitOk() {
        final double vCircuitOk = 9.0;

        final double result = triangle.getCircuit();

        assertEquals(result, vCircuitOk);
    }

    @Test
    public void getCircuitNotOk() {

        final double vCircuitNotOk = 32.0;

        final double result = triangle.getCircuit();

        assertNotEquals(result, vCircuitNotOk);
    }
}
