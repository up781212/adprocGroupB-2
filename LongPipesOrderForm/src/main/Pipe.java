package main;

/* 
Ah, a glorious Pipe! 
Or, Picasso's implementation of one... Make sure not to reference this class
directly to make a pipe. PipeFactory will do the work for you.
*/

public abstract class Pipe {
    private int grade; //Grade 1-5
    private boolean chemicalResistance; //Available for all 
    private double costPerInch; //In pounds
    
    /*
    ALL INPUT UNITS IN INCHES FOR SIMPLICITY. 
    MAKE SURE CONVERSION HAS BEEN DONE IN BOXFACTORY!
    */
    
    //All stored in inches
    private double length; 
    private double outerDiameter; 
    private double innerDiameter; 
    
  
    public Pipe(int grade, boolean chemicalResistance, double length, double outerDiameter){
        this.grade = grade;
        this.chemicalResistance = chemicalResistance;
        this.length = length;
        this.outerDiameter = outerDiameter;
        innerDiameter = outerDiameter * 0.9;
    }
    
    
    
    
    public int getGrade(){
        return grade;
    }
    
    public boolean getChemicalResistance(){
        return chemicalResistance;
    }
    public void setChemicalResistance(boolean chemicalResistance){
        this.chemicalResistance = chemicalResistance;
    }
    
    public double getCostPerInch(){
        return costPerInch;
    }
    
}
