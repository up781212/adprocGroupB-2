package main;

public class PipeT2 extends Pipe {

    public PipeT2(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.6, 0.75, 0.8};//set cost per inch
        calculateCost();
    }

    public void calculateCost() {
        double cost = calculateBaseCost();
        costTotal += baseCost * 0.12; //add 1 colour
    }
}
