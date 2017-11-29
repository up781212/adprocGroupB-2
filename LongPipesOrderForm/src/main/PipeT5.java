package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

public class PipeT5 extends PipeT4 {

    public PipeT5(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty) {
        super(grade-1, chemicalResistance, length, outerDiameter, qty);
        costPerInch = new double[]{0.75, 0.8, 0.95};//set cost per inch
        calculateCostT5();
    }

    public void calculateCostT5() {
        costTotal += baseCost * 0.17;//add Inner insulation
        System.out.println("from T5 " + costTotal);
    }
    
        //override to return correct grade.
    @Override
    public int getGrade() {
        return grade + 1;
    }
    
    public String getOuterReinforcement(){
        return "Yes";
    }
    
}
