import org.example.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTest {
    @Test
void testFeetEquality_SameValue() {
    QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
    QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(1.0);
    assertEquals(a, b);
    assertEquals(b, a);
}
    @Test
    void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(2.0);
        assertNotEquals(a, b);
    }
    @Test
    void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertNotEquals(a, null);
    }
    @Test
    void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        Object other = new Object();
        assertNotEquals(a, other);
    }
    @Test
    void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertEquals(a, a);
    }
}