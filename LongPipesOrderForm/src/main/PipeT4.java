package main;

public class PipeT4 extends PipeT3 {

    boolean innerInsulation;

    //costPerInch not needed, T3 and 4 share the same cost per inch.
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation) {
        super(grade, chemicalResistance, length, outerDiameter);
        this.innerInsulation = innerInsulation;
    }
    
    public void calculateCost() {
        double cost = calculateBaseCost();
        double costIncrease;
        costIncrease = cost * 0.16; //add 2 colours
        costIncrease += cost * 0.13; //adds Inner Insulation
        if (getChemicalResistance()) {
            costIncrease += cost * 1.14;
        }
        cost += costIncrease;
        //Not sure if this works better?
    }
}
