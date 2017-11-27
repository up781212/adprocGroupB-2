package main;

/**
 *
 * @author 781212
 *
 */

public class PipeT5 extends PipeT4 {

    public PipeT5(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.75, 0.8, 0.95};//set cost per inch
        calculateCostT5();
    }

    public void calculateCostT5() {
        costTotal += baseCost * 0.17;//add Inner insulation
    }
}
