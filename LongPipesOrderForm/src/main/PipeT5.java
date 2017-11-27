package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
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
    public void calculateCost() {
        double cost = calculateBaseCost();
        double costIncrease;
        costIncrease = cost * 0.16; //add 2 colours
        costIncrease += cost * 0.13; //adds Inner Insulation
        costIncrease += cost * 0.17; //adds Outer resistance
        if (getChemicalResistance()) {
            costIncrease += cost * 0.14;
        }
        costTotal = cost + costIncrease;
        //Not sure if this works better?
    }
}
