package main;

public class PipeT5 extends PipeT4 {
    boolean outerReinforcement;
    public PipeT5(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement) {
        super(grade, chemicalResistance, length, outerDiameter, innerInsulation);
        costPerInch = new double[]{0.75,0.8,0.95};
        this.outerReinforcement = outerReinforcement;
    }
}
