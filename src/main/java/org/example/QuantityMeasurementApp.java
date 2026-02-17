package org.example;
public class QuantityMeasurementApp {
    /*
    public static final class Feet {
public static final class Feet {
        private final double value;
        public Feet(double value) {
            this.value = value;
        }
        public double value() {
            return value;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
        @Override
        public String toString() {
            return value + " ft";
        }
    }*/
    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }
    public static double convert(
            double value,
            LengthUnit sourceUnit,
            LengthUnit targetUnit) {
        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Value must be finite");
        if (sourceUnit == null || targetUnit == null)
            throw new IllegalArgumentException("Units cannot be null");
        double inches = sourceUnit.toInches(value);
        return targetUnit.fromInches(inches);
    }
    public static Length demonstrateLengthConversion(
            Length length,
            LengthUnit targetUnit) {
        return length.convertTo(targetUnit);
    }
    public static Length add(Length l1, Length l2, LengthUnit targetUnit) {
        if (l1 == null || l2 == null)
            throw new IllegalArgumentException("Operands cannot be null");
        if (targetUnit == null)
            throw new IllegalArgumentException("Target unit cannot be null");
        double inches1 = l1.convertTo(LengthUnit.INCHES).value();
        double inches2 = l2.convertTo(LengthUnit.INCHES).value();
        double sumInches = inches1 + inches2;
        double finalValue = targetUnit.fromInches(sumInches);
        return new Length(finalValue, targetUnit);
    }
    public static void main(String[] args) {
           /* Feet a = new Feet(1.0);
            Feet b = new Feet(1.0);
            System.out.println(a.equals(b));*/
            /*Length length1 = new Length(1.0, LengthUnit.FEET);
            Length length2 = new Length(12.0, LengthUnit.INCHES);
            System.out.println(length1.equals(length2));
            Length length3 = new Length(1.0, LengthUnit.YARDS);
            Length length4 = new Length(3.0, LengthUnit.FEET);
            System.out.println(length3.equals(length4));
            Length length5 = new Length(1.0, LengthUnit.CENTIMETERS);
            Length length6 = new Length(0.393701, LengthUnit.INCHES);
            System.out.println(length5.equals(length6));*/
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = feet.convertTo(LengthUnit.INCHES);
        System.out.println(inches);
        System.out.println(convert(3.0, LengthUnit.YARDS, LengthUnit.FEET));
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);
        Length result = add(l1, l2, LengthUnit.FEET);
        System.out.println("1 FEET + 12 INCHES = " + result);
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length threeFeet = new Length(3.0, LengthUnit.FEET);
        System.out.println("1 YARD equals 3 FEET ? " + demonstrateLengthEquality(yard, threeFeet));
    }
}