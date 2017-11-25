package main;

public class PipeT3 extends Pipe {

    public PipeT3(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        costPerInch = new double[]{0.75, 0.8, 0.95};//set cost per inch
        colour = 2;
    }
}
