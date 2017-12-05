package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */
public class PipeT5 extends PipeT4 {
    public PipeT5(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty);
        costPerInch = new double[]{0, 0, 0.75, 0.8, 0.95};//set cost per inch
        calculateCost();
    }

    //override to ensure correct output
    @Override
    public void calculateCost() {
        calculateBaseCost();
        costTotal += baseCost * 0.16; //add 2 colours
        costTotal += baseCost * 0.17;//add outer reinforcement
        costTotal += baseCost * 0.13; //add inner insulation
    }

    //override to return correct grade.
    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public String getOuterReinforcement() {
        return "Yes";
    }

}
