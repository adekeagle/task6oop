package ShapeTest;

import model.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RectangleTest implements FigureTest {

    private Rectangle rectangle;

    @BeforeEach
    void setUp()
    {
        rectangle = new Rectangle(3, 3);
    }

    @Test
    public void getAreaOk() {
        final double vAreaOk = 9.0;

        final double result = rectangle.getArea();

        assertEquals(result, vAreaOk);
    }

    @Test
    public void getAreaNotOk() {
        final double vAreaNotOk = 55.0;

        final double result = rectangle.getArea();

        assertNotEquals(result, vAreaNotOk);
    }

    @Test
    public void getCircuitOk() {
        final double vCircuitOk = 12.0;

        final double result = rectangle.getCircuit();

        assertEquals(result, vCircuitOk);
    }

    @Test
    public void getCircuitNotOk() {
        final double vCircuitNotOk = 52.0;

        final double result = rectangle.getCircuit();

        assertNotEquals(result, vCircuitNotOk);
    }
}
