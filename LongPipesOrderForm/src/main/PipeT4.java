package main;

public class PipeT4 extends PipeT3 {

    //costPerInch not needed, T3 and 4 share the same cost per inch.
    public PipeT4(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        super(grade, chemicalResistance, length, outerDiameter);
        calculateCostT4();
    }
    public void calculateCostT4(){
        costTotal += baseCost * 0.13;//add Inner insulation
    }
}
