package main;

/*
Welcome to the Pipe Factory!
Here pipes are made based on the input criteria given 
(aka check the different features of the pipe, then create the right tier in the return)

Please input the data from user input here for validation and to determine which pipe is needed,
DO NOT REFERENCE PIPE OR ITS CHILDREN DIRECTLY WHEN CREATING PIPES!!!
 */
public class PipeFactory {

    //checks the pipe type from criteria and uses to validate.
    public Boolean PipeCheck(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement) {
        //if it's 0 then the pipe is not valid, any other value is.
        return ValidatePipe(grade, chemicalResistance, length, outerDiameter, innerInsulation, outerReinforcement) == 0;

    }

    //improve this later, checks pipe type and then creates an object of that type
    public Pipe MakePipe(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement) {
        byte type = ValidatePipe(grade, chemicalResistance, length, outerDiameter, innerInsulation, outerReinforcement);
        switch (type) {
            case 1:
                PipeT1 pip = new PipeT1(grade, chemicalResistance, length, outerDiameter);
                return pip;
            case 2:
                PipeT2 pip2 = new PipeT2(grade, chemicalResistance, length, outerDiameter);
                return pip2;
            case 3:
                PipeT3 pip3 = new PipeT3(grade, chemicalResistance, length, outerDiameter);
                return pip3;
            case 4:
                PipeT4 pip4 = new PipeT4(grade, chemicalResistance, length, outerDiameter, innerInsulation);
                return pip4;
            default:
                PipeT5 pip5 = new PipeT5(grade, chemicalResistance, length, outerDiameter, innerInsulation, outerReinforcement);
                return pip5;
        }

    }

    private byte ValidatePipe(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement) {
        return 0;
    }
}
