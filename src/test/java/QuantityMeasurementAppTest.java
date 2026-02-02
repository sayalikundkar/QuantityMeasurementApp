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
  /* @Test
   void testEquality_FeetToFeet_SameValue() {
       assertEquals(
               new Length(1.0, LengthUnit.FEET),
               new Length(1.0, LengthUnit.FEET)
       );
   }
    @Test
    void testEquality_InchToInch_SameValue() {
        assertEquals(
                new Length(1.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_FeetToInch_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(12.0, LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_InchToFeet_EquivalentValue() {
        assertEquals(
                new Length(12.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_Feet_DifferentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.FEET),
                new Length(2.0, LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_Inch_DifferentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.INCHES),
                new Length(2.0, LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_InvalidUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(1.0, null)
        );
    }
    @Test
    void testEquality_NullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(1.0, null)
        );
    }
    @Test
    void testEquality_SameReference() {
        Length length = new Length(1.0, LengthUnit.FEET);
        assertEquals(length, length);
    }
    @Test
    void testEquality_NullComparison() {
        Length length = new Length(1.0, LengthUnit.FEET);
        assertNotEquals(length, null);
    }*/
   @Test
   void testEquality_YardToYard_SameValue() {
       assertEquals(
               new Length(1.0, LengthUnit.YARDS),
               new Length(1.0, LengthUnit.YARDS)
       );
   }
    @Test
    void testEquality_YardToYard_DifferentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(2.0, LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToFeet_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(3.0, LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_FeetToYard_EquivalentValue() {
        assertEquals(
                new Length(3.0, LengthUnit.FEET),
                new Length(1.0, LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToInches_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(36.0, LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_InchesToYard_EquivalentValue() {
        assertEquals(
                new Length(36.0, LengthUnit.INCHES),
                new Length(1.0, LengthUnit.YARDS)
        );
    }
    @Test
    void testEquality_YardToFeet_NonEquivalentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.YARDS),
                new Length(2.0, LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_CentimetersToInches_EquivalentValue() {
        assertEquals(
                new Length(1.0, LengthUnit.CENTIMETERS),
                new Length(0.393701, LengthUnit.INCHES)
        );
    }
    @Test
    void testEquality_CentimetersToFeet_NonEquivalentValue() {
        assertNotEquals(
                new Length(1.0, LengthUnit.CENTIMETERS),
                new Length(1.0, LengthUnit.FEET)
        );
    }
    @Test
    void testEquality_MultiUnit_TransitiveProperty() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length inches = new Length(36.0, LengthUnit.INCHES);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }
    @Test
    void testEquality_YardWithNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(1.0, null)
        );
    }
    @Test
    void testEquality_YardSameReference() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        assertEquals(yard, yard);
    }
    @Test
    void testEquality_YardNullComparison() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        assertNotEquals(yard, null);
    }
    @Test
    void testEquality_CentimetersWithNullUnit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Length(1.0, null)
        );
    }
    @Test
    void testEquality_CentimetersSameReference() {
        Length cm = new Length(1.0, LengthUnit.CENTIMETERS);
        assertEquals(cm, cm);
    }
    @Test
    void testEquality_CentimetersNullComparison() {
        Length cm = new Length(1.0, LengthUnit.CENTIMETERS);
        assertNotEquals(cm, null);
    }
    @Test
    void testEquality_AllUnits_ComplexScenario() {
        Length yards = new Length(2.0, LengthUnit.YARDS);
        Length feet = new Length(6.0, LengthUnit.FEET);
        Length inches = new Length(72.0, LengthUnit.INCHES);
        assertEquals(yards, feet);
        assertEquals(feet, inches);
        assertEquals(yards, inches);
    }
}