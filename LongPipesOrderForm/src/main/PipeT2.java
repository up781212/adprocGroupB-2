package main;

public class PipeT2 extends Pipe {

    public PipeT2(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.6,0.75,0.8};//set cost per inch
    }

    public void calculateCost() {
        double cost = calculateBaseCost();
        costTotal *= 1.12; //add 1 colour
        if (getChemicalResistance()) {
            costTotal = cost * 1.14;
        }
    }
}
