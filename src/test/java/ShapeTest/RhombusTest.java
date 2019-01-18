package ShapeTest;

import model.Rhombus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RhombusTest implements FigureTest {

    private Rhombus rhombus;

    @BeforeEach
    void setUp()
    {
        rhombus = new Rhombus(3, 5);
    }

    @Test
    public void getAreaOk() {
        final double vAreaOk = 15.0;

        final double result = rhombus.getArea();

        assertEquals(result, vAreaOk);
    }

    @Test
    public void getAreaNotOk() {
        final double vAreaNotOk = 55.0;

        final double result = rhombus.getArea();

        assertNotEquals(result, vAreaNotOk);
    }

    @Test
    public void getCircuitOk() {
        final double vCircuitOk = 12.0;

        final double result = rhombus.getCircuit();

        assertEquals(result, vCircuitOk);
    }

    @Test
    public void getCircuitNotOk() {
        final double vCircuitNotOk = 52.0;

        final double result = rhombus.getCircuit();

        assertNotEquals(result, vCircuitNotOk);
    }
}
