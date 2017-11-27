package main;

/**
 *
 * @author 781212
 *
 */

public class PipeT3 extends Pipe {

    public PipeT3(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.75, 0.8, 0.95};//set cost per inch
        calculateCost();
    }

    public void calculateCost() {
        double cost = calculateBaseCost();
        costTotal += baseCost * 0.16; //add 1 colour
    }
}