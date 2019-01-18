package ShapeTest;

import model.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SquareTest implements FigureTest {

    private Square square;

    @BeforeEach
    void setUp()
    {
        square = new Square(5);
    }

    @Test
    public void getAreaOk() {
        final double vAreaOk = 25.0;

        final double result = square.getArea();

        assertEquals(result, vAreaOk);
    }

    @Test
    public void getAreaNotOk() {
        final double vAreaNotOk = 55.0;

        final double result = square.getArea();

        assertNotEquals(result, vAreaNotOk);
    }

    @Test
    public void getCircuitOk() {
        final double vCircuitOk = 20.0;

        final double result = square.getCircuit();

        assertEquals(result, vCircuitOk);
    }

    @Test
    public void getCircuitNotOk() {
        final double vCircuitNotOk = 12.0;

        final double result = square.getCircuit();

        assertNotEquals(result, vCircuitNotOk);
    }
}
