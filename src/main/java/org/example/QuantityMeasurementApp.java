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
                // 1) same reference
                if (this == obj) return true;
                // 2) null check
                if (obj == null) return false;
                // 3) type check: only equal to Feet
                if (getClass() != obj.getClass()) return false;

                Feet other = (Feet) obj;
                // 4) value-based equality using Double.compare to avoid == pitfalls
                return Double.compare(this.value, other.value) == 0;
            }

            @Override
            public int hashCode() {
                // Maintain equals-hashCode contract
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
        }
    }