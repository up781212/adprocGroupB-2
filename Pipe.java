package main;

/**
 *
 * @author 781212
 *
 */

//UPDATE SUBCLASSES TO BE MORE STRUCTURED INSTEAD OF ALL COMING OFF OF THIS DIRECTLY
/* 
Ah, a glorious Pipe! 
Or, Picasso's implementation of one... Make sure not to reference this class
directly to make a pipe. PipeFactory will do the work for you.
 */
public abstract class Pipe {

    private int grade; //Grade 1-5
    private boolean chemicalResistance; //Available for all 
    protected double[] costPerInch; //Used to display available grades and their equivilence 
    protected double costTotal; //The total cost of the pipe
    protected double baseCost; //The base cost 
    
    //All dimensions stored in inches
    private double length;
    private double outerDiameter;
    private double innerDiameter;

    public Pipe(int grade, boolean chemicalResistance, double length, double outerDiameter) {
        this.grade = grade;
        this.chemicalResistance = chemicalResistance;
        this.length = length;
        this.outerDiameter = outerDiameter;
        innerDiameter = outerDiameter * 0.9;
        calculateCost();
    }

    public int getGrade() {
        return grade;
    }

    public boolean getChemicalResistance() {
        return chemicalResistance;
    }

    public void setChemicalResistance(boolean chemicalResistance) {
        this.chemicalResistance = chemicalResistance;
    }

    public double getCostPerInch() {
        return costPerInch[grade];
    }

    public double getCostTotal() {
        calculateCost();
        return costTotal;
    }

    public double getLength() {
        return length;
    }

    public double getOuterDiameter() {
        return outerDiameter;
    }

    public double getInnerDiameter() {
        return innerDiameter;
    }

    /*
    METHODS
     */
    //Work out area of pipe
    private double pipeVolume() {
        //subtract volume inside of the pipe from the total volume to get pipe volume
        return cylinderVolume(outerDiameter) - cylinderVolume(innerDiameter);
    }

    //Work out area of cylinder
    private double cylinderVolume(double d) {
        //formula for area of a cylindar.
        return Math.PI * Math.pow((d / 2), 2) * length;
    }

    //Work out your cost 
    protected double calculateBaseCost() {
        double cost = pipeVolume() * costPerInch[grade];
        baseCost = cost;
        
        if (chemicalResistance) {
            costTotal *= 1.14;//add chemical resistance
        }
        return cost;
    }

    /*Other additionalCosts can be calculated here. 
    The base cost is universal. 
    Class is overridden in every Type with exception to 
    T1 in order to add all additional costs.
     */
    protected void calculateCost() {
        costTotal = calculateBaseCost();

    }

}
