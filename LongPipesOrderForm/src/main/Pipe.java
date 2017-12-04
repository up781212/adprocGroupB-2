package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */
//UPDATE SUBCLASSES TO BE MORE STRUCTURED INSTEAD OF ALL COMING OFF OF THIS DIRECTLY
/*
Ah, a glorious Pipe!
Or, Picasso's implementation of one... Make sure not to reference this class
directly to make a pipe. PipeFactory will do the work for you.
 */
public abstract class Pipe {

    private int qty;
    protected int grade; //Grade 1-5
    private boolean chemicalResistance; //Available for all
    protected double[] costPerInch; //Used to display available grades and their equivilence
    protected double costTotal; //The total cost of the pipe
    protected double baseCost; //The base cost
    protected int colours;

    //All dimensions stored in inches
    private double length;
    private double outerDiameter;
    private double innerDiameter;

    public Pipe(int grade, boolean chemicalResistance, double length, double outerDiameter, int qty, int colours) {
        this.grade = grade;
        this.chemicalResistance = chemicalResistance;
        this.length = length;
        this.outerDiameter = outerDiameter;
        innerDiameter = outerDiameter * 0.9;
        this.qty = qty;
        this.colours = colours;

    }

    //get / set methods
    public int getGrade() {
        return grade;
    }

    public void setChemicalResistance(boolean chemicalResistance) {
        this.chemicalResistance = chemicalResistance;
    }

    public double getCostPerInch() {
        return costPerInch[grade];
    }

    public double getCostTotal() {
        return costTotal * qty;
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

    public int getQty() {
        return qty;
    }

    public int getColour() {
        return colours;
    }

    public String getInnerInsulation() {
        return "No ";
    }

    public String getOuterReinforcement() {
        return "No ";
    }

    public String getChemicalResistance() {
        if (chemicalResistance) {
            return "Yes";
        }
        return "No ";
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
    protected void calculateBaseCost() {
        double cost = pipeVolume() * costPerInch[grade - 1];
        baseCost = cost;
        if (chemicalResistance) {
            cost += baseCost * 0.14;//add chemical resistance
        }
        costTotal = cost;
    }

    /*Other additionalCosts can be calculated here.
    The base cost is universal.
    Class is overridden in every Type with exception to
    T1 in order to add all additional costs.
     */
    protected void calculateCost() {
        calculateBaseCost();

    }

}
