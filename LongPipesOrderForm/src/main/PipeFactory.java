package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

/*
Welcome to the Pipe Factory!
Here pipes are made based on the input criteria given
(aka check the different features of the pipe, then create the right tier in the return)

Please input the data from user input here for validation and to determine which pipe is needed,
DO NOT REFERENCE PIPE OR ITS CHILDREN DIRECTLY WHEN CREATING PIPES!!!
 */
public class PipeFactory {

    //checks the pipe type from criteria and uses to validate.
    public Boolean PipeCheck(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement, int colour) {
        //if it's 0 then the pipe is not valid, any other value is.
        return ValidatePipe(grade, chemicalResistance, length, outerDiameter, innerInsulation, outerReinforcement, colour) != 0;
    }

    //improve this later, checks pipe type and then creates an object of that type
    public Pipe MakePipe(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement, int colour) {
        length = convertToInches(length);//convert length to inches, all values are the same type within pipe classes.

        byte type = ValidatePipe(grade, chemicalResistance, length, outerDiameter, innerInsulation, outerReinforcement, colour);
        switch (type) {
            case 1:
                PipeT1 pip1 = new PipeT1(grade, chemicalResistance, length, outerDiameter);
                return pip1;
            case 2:
                PipeT2 pip2 = new PipeT2(grade, chemicalResistance, length, outerDiameter);
                return pip2;
            case 3:
                PipeT3 pip3 = new PipeT3(grade, chemicalResistance, length, outerDiameter);
                return pip3;
            case 4:
                PipeT4 pip4 = new PipeT4(grade, chemicalResistance, length, outerDiameter);
                return pip4;
            default:
                PipeT5 pip5 = new PipeT5(grade, chemicalResistance, length, outerDiameter);
                return pip5;
        }

    }

    //checks if a pipe is valid and returns a byte of the pipe's type. 0 is given in the case of a pipe being invalid.
    private byte ValidatePipe(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement, int colour) {
        if (grade > 0 && colour >= 0 && colour <= 2) {
            if (colour == 2 && grade >= 2) {
                if (innerInsulation) {
                    if (outerReinforcement && grade >= 3) {
                        return 5; //type 5
                    } else {
                        return 4; //type 4
                    }
                }
                if (!innerInsulation && !outerReinforcement) {
                    return 3; //type 3
                }
            }
            if (!innerInsulation && !outerReinforcement) {
                if (colour == 1 && grade >= 2 && grade <= 4) {
                    return 2; //type 2
                }
                if (colour == 0 && grade <= 3) {
                    return 1; //type 1
                }
            }
        }
        return 0; //grade invalid. Either invalid input or invalid type
    }

    protected double convertToInches(double meter) {
        return meter * 39.37;
    }

    protected double convertToMeters(double inch) {
        return inch * 0.0254;
    }
}
