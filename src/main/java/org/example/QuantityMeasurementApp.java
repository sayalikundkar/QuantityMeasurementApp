package org.example;
public class QuantityMeasurementApp {
        /*
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
        public static void main(String[] args) {
           /* Feet a = new Feet(1.0);
            Feet b = new Feet(1.0);
            System.out.println(a.equals(b));*/
            Length length1 = new Length(1.0, LengthUnit.FEET);
            Length length2 = new Length(12.0, LengthUnit.INCHES);
            System.out.println(length1.equals(length2));
            Length length3 = new Length(1.0, LengthUnit.YARDS);
            Length length4 = new Length(3.0, LengthUnit.FEET);
            System.out.println(length3.equals(length4));
            Length length5 = new Length(1.0, LengthUnit.CENTIMETERS);
            Length length6 = new Length(0.393701, LengthUnit.INCHES);
            System.out.println(length5.equals(length6));
        }
    }