package main;

//UPDATE SUBCLASSES TO BE MORE STRUCTURED INSTEAD OF ALL COMING OFF OF THIS DIRECTLY


/* 
Ah, a glorious Pipe! 
Or, Picasso's implementation of one... Make sure not to reference this class
directly to make a pipe. PipeFactory will do the work for you.
*/

public abstract class Pipe {
    private int grade; //Grade 1-5
    private boolean chemicalResistance; //Available for all 
    private double costPerInch; //In pounds
    protected double costTotal; //The total cost of the pipe
    
    /*
    ALL INPUT UNITS IN INCHES FOR SIMPLICITY. 
    MAKE SURE CONVERSION HAS BEEN DONE IN BOXFACTORY!
    */
    
    //All stored in inches
    private double length; 
    private double outerDiameter; 
    private double innerDiameter; 
    
  
    public Pipe(int grade, boolean chemicalResistance, double length, double outerDiameter, double costPerInch){
        this.grade = grade;
        this.chemicalResistance = chemicalResistance;
        this.length = length;
        this.outerDiameter = outerDiameter;
        this.costPerInch = costPerInch;
        innerDiameter = outerDiameter * 0.9;
        calculateCost();
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
    public double getCostTotal(){
        calculateCost();
        return costTotal;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getOuterDiameter(){
        return outerDiameter;
    }
    
    public double getInnerDiameter(){
        return innerDiameter;
    }
    
    /*
    METHODS
    */  
    //Work out area of pipe
    private double pipeArea(){
        return cylinderArea(outerDiameter) - cylinderArea(innerDiameter);
    }
            
    //Work out area of cylinder
    private double cylinderArea(double d){
        return Math.PI * (d/2) * length ;
    }
    
    //Work out your cost 
    protected double calculateBaseCost(){
        double cost = pipeArea() * costPerInch;
        return cost;
    }
    
    /*Other additionalCosts can be calculated here. 
    The base cost is universal. 
    Less checks having to be done overall this way.
    */
    protected void calculateCost(){
        costTotal = calculateBaseCost();
        if(chemicalResistance) costTotal *= 1.14;
    }

}
