import org.example.Length;
import org.example.LengthUnit;
import org.example.QuantityMeasurementApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class QuantityMeasurementAppTest {
   /* @Test
void testFeetEquality_SameValue() {
    QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
    QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(1.0);
    assertEquals(a, b);
    assertEquals(b, a); // symmetry
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
        assertEquals(a, a); // reflexive
    }*/
   @Test
   void testFeetToFeet_SameValue() {
       assertEquals(
               new Length(1.0, LengthUnit.FEET),
               new Length(1.0, LengthUnit.FEET)
       );
   }

    @Test
    void testInchToInch_SameValue() {
        assertEquals(
                new Length(1.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.INCHES)
        );
    }

    @Test
    void testFeetToInch_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(12.0, LengthUnit.INCHES)
        );
    }

    @Test
    void testInchToFeet_EquivalentValue() {
        assertEquals(
                new Length(12.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.FEET)
        );
    }

    @Test
    void testDifferentValues_NotEqual() {
        assertNotEquals(
                new Length(2.0, LengthUnit.FEET),
                new Length(1.0, LengthUnit.FEET)
        );
    }

    @Test
    void testNullComparison() {
        assertNotEquals(
                new Length(1.0, LengthUnit.FEET),
                null
        );
    }

    @Test
    void testSameReference() {
        Length length = new Length(1.0, LengthUnit.FEET);
        assertEquals(length, length);
    }

    @Test
    void testNullUnitThrowsException() {
        assertThrows(IllegalArgumentException.class, () ->
                new Length(1.0, null)
        );
    }

}
