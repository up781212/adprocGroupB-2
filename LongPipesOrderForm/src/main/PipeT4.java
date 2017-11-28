package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

public class PipeT4 extends PipeT3 {

    //costPerInch not needed, T3 and 4 share the same cost per inch.
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter, byte qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty);
        calculateCostT4();
    }

    public void calculateCostT4() {
        costTotal += baseCost * 0.13;//add Inner insulation
    }
}
