package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

public class PipeT2 extends Pipe {

    public PipeT2(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty,1);
        costPerInch = new double[]{0, 0.6, 0.75, 0.8};//set cost per inch
        calculateCost();
    }

    @Override
    public void calculateCost() {
        double cost = calculateBaseCost();
        costTotal = cost;
        costTotal += cost * 0.12; //add 1 colour
    }
    
    //override to return correct grade.
    @Override
     public int getGrade() {
        return grade;
    }
    
}
