package main;

public class PipeT4 extends PipeT3 {
    boolean innerInsulation;
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation) {
        super(grade, chemicalResistance, length, outerDiameter);
        this.innerInsulation = innerInsulation;
    }
}
