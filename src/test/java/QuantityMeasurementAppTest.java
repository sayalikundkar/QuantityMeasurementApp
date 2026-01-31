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
    @Test
    void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches b = new QuantityMeasurementApp.Inches(1.0);
        assertEquals(a, b);
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertNotEquals(
                new QuantityMeasurementApp.Inches(1.0),
                new QuantityMeasurementApp.Inches(2.0)
        );
    }

    @Test
    void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        assertNotEquals(a, null);
    }

    @Test
    void testInchesEquality_DifferentClass() {
        assertNotEquals(
                new QuantityMeasurementApp.Inches(1.0),
                new QuantityMeasurementApp.Feet(1.0)
        );
    }

    @Test
    void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        assertEquals(a, a);
    }
}