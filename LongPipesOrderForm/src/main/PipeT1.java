package main;

public class PipeT1 extends Pipe {

    public PipeT1(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.4, 0.6, 0.75}; //SET COST PER INCH FOR CLASS
    }

}
