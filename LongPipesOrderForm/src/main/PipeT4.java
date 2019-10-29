package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

public class PipeT4 extends PipeT3 {

    //costPerInch not needed, T3 and 4 share the same cost per inch.
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty);
        calculateCostT4();
    }

    public void calculateCostT4() {
        costTotal += baseCost * 0.13;//add Inner insulation

    }
    @Override
    public String getInnerInsulation(){
        return "Yes";
    }
    
    public void calculateCost() {
        double cost = calculateBaseCost();
        double costIncrease;
        costIncrease = cost * 0.16; //add 2 colours
        costIncrease += cost * 0.13; //adds Inner Insulation
        if (getChemicalResistance()) {
            costIncrease += cost * 0.14;
        }
        costTotal = cost + costIncrease;
        //Not sure if this works better?
    }
}
