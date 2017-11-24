package main;

/*
Welcome to the Pipe Factory!
Here pipes are made based on the input criteria given 
(aka check the different features of the pipe, then create the right tier in the return)

Please input the data from user input here for validation and to determine which pipe is needed,
DO NOT REFERENCE PIPE OR ITS CHILDREN DIRECTLY!!!
*/
public class PipeFactory {

    //checks the pipe type from criteria and uses to create a valid pipe.
    public Pipe PipeCheck(int grade, boolean chemicalResistance, double length, double outerDiameter){
        
        
        //placeholder code
        PipeT2 pip = new PipeT2(grade, chemicalResistance, length, outerDiameter);
        return pip;
    }
}
