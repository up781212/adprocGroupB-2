package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

public class PipeT1 extends Pipe {

    public PipeT1(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade, chemicalResistance, length, outerDiameter, qty);
        costPerInch = new double[]{0.4, 0.6, 0.75}; //SET COST PER INCH FOR CLASS
        calculateCost();

    }

}
