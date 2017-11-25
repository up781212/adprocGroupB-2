package main;

public class PipeT5 extends PipeT4 {

    boolean outerReinforcement;

    public PipeT5(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement) {
        super(grade, chemicalResistance, length, outerDiameter, innerInsulation);
        costPerInch = new double[]{0.75, 0.8, 0.95};//set cost per inch
        this.outerReinforcement = outerReinforcement;
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
        cost += costIncrease;
        //Not sure if this works better?
    }
}
