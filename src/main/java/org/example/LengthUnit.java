package org.example;
public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0);
    private final double conversionFactorToInches;
    LengthUnit(double conversionFactorToInches) {
        this.conversionFactorToInches = conversionFactorToInches;
    }
    public double toInches(double value) {
        return value * conversionFactorToInches;
    }
}