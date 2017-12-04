package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */
public class PipeT3 extends Pipe {

    public PipeT3(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty, 2);
        costPerInch = new double[]{0, 0.6, 0.75, 0.8, 0.95};//set cost per inch
        calculateCost();
    }

    @Override
    public void calculateCost() {
        calculateBaseCost();
        costTotal += baseCost * 0.16; //add 2 colours
    }

    //override to return correct grade.
    @Override
    public int getGrade() {
        return grade + 1;
    }
}
