package org.example;
import java.util.Objects;
public class Length {
    private final double value;
    private final LengthUnit unit;
    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be finite");
        }
        this.value = value;
        this.unit = unit;
    }
    private double toInches() {
        return unit.toInches(value);
    }
    public Length convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        double inches = this.toInches();
        double convertedValue = targetUnit.fromInches(inches);
        convertedValue = Math.round(convertedValue * 100.0) / 100.0;
        return new Length(convertedValue, targetUnit);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;
        return Double.compare(this.toInches(), other.toInches()) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(toInches());
    }
    @Override
    public String toString() {
        return value + " " + unit;
    }
}
