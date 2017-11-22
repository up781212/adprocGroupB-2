package main;

public class PipeT1 extends Pipe {
    public PipeT1(int grade, boolean chemicalResistance, double length, double outerDiameter, double costPerInch){
        super(grade, chemicalResistance, length, outerDiameter, 0.4);
    }
 public void calculateCost(){
  double cost = calculateBaseCost();
  costTotal *= 1.16; //add 1 colour
  if(getChemicalResistance()) costTotal = cost * 1.14;
 }
}
