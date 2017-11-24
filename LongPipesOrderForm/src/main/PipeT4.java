package main;

public class PipeT4 extends PipeT3 {

    boolean innerInsulation;

    //costPerInch not needed, T3 and 4 share the same cost per inch.
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation) {
        super(grade, chemicalResistance, length, outerDiameter);
        this.innerInsulation = innerInsulation;
    }
}
