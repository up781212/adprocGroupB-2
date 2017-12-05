package main;

/**
 *
 * @author 781212, 788777, 777611, 790487
 *
 */

/*
Welcome to the Pipe Factory!
Here pipes are made based on the input criteria given
(check the different features of the pipe, then create the right tier in the return)

Please input the data from user input here for validation and to determine which pipe is needed,
DO NOT REFERENCE PIPE OR ITS CHILDREN DIRECTLY FROM OUTSIDE PIPEFACTORY WHEN CREATING PIPES!!!
 */
public class PipeFactory {

    //makes the pipes. Ensure pipes have been tested by TestPipe before doing so.
    public Pipe MakePipe(int grade, boolean chemicalResistance, double length, double outerDiameter, boolean innerInsulation, boolean outerReinforcement, int colour, int qty) {
        length = convertToInches(length);//convert length to inches, all values are the same type within pipe classes.

        String type = ValidatePipe(grade, innerInsulation, outerReinforcement, colour);
        switch (type) {
            case "Type 1":
                PipeT1 pip1 = new PipeT1(grade, chemicalResistance, length, outerDiameter, qty);
                return pip1;
            case "Type 2":
                PipeT2 pip2 = new PipeT2(grade, chemicalResistance, length, outerDiameter, qty);
                return pip2;
            case "Type 3":
                PipeT3 pip3 = new PipeT3(grade, chemicalResistance, length, outerDiameter, qty);
                return pip3;
            case "Type 4":
                PipeT4 pip4 = new PipeT4(grade, chemicalResistance, length, outerDiameter, qty);
                return pip4;
            default:
                PipeT5 pip5 = new PipeT5(grade, chemicalResistance, length, outerDiameter, qty);
                return pip5;
        }

    }

    //checks if a pipe is valid and returns a String of the pipe's type. Error is given in the case of a pipe being invalid.
    public String ValidatePipe(int grade, boolean innerInsulation, boolean outerReinforcement, int colour) {

        //validation follows pattern [pipetype 1 - 5]
        //[testCriteria] min grade, max grade, inner insulation, outer reinforcement, colour.
        int validationCriteria[][] = {
            {1, 3, 0, 0, 0},
            {2, 4, 0, 0, 1},
            {2, 4, 0, 0, 2},
            {2, 4, 1, 0, 2},
            {3, 5, 1, 1, 2}};

        String ret;

        int maxMatch = 0; //count the number of criteria met for each class.
        int maxMatchCounter = 0; //store the type that got the maxMatch
        //grade,innerinsulation, outerreinforcement, colour
        String failedItems[] = {"", "", "", ""};//use to return fails to change in case of no match

        for (int x = 0; x < 5; x++) {
            int matchCount = 0;
            String currentFailed[] = new String[4]; //store which item failed from that failure
            if (validationCriteria[x][0] <= grade && validationCriteria[x][1] >= grade) {
                matchCount++;
                currentFailed[0] = "";
            } else {
                currentFailed[0] = "\nPlease set grade between " + validationCriteria[x][0] + " and " + validationCriteria[x][1];
            }
            if (validationCriteria[x][2] == convertBool(innerInsulation)) {
                matchCount++;
                currentFailed[1] = "";

            } else {
                currentFailed[1] = "\nToggle inner insulation.";
            }
            if (validationCriteria[x][3] == convertBool(outerReinforcement)) {
                matchCount++;
                currentFailed[2] = "";
            } else {
                currentFailed[2] = "\nToggle outer reinforcement";
            }
            if (validationCriteria[x][4] == colour) {
                matchCount++;
                currentFailed[3] = "";
            } else {
                currentFailed[3] = "\nSet colour to " + validationCriteria[x][4];
            }
            if (matchCount > maxMatch) {
                maxMatch = matchCount;
                maxMatchCounter = x;
                failedItems = currentFailed;
            }
        }

        if (maxMatch < 4) {
            //add suggested edits for the user here
            ret = "Sorry, we are unable to fulfill this order. \nWe can create a pipe with the changes specified below.";
            for (int x = 0; x < 4; x++) {
                ret += failedItems[x];
            }
        } else {
            ret = "Type " + (maxMatchCounter + 1);
        }
        return ret;
    }

    protected double convertToInches(double meter) {
        return meter * 39.37;
    }

    protected double convertToMeters(double inch) {
        return inch * 0.0254;
    }

    private int convertBool(boolean b) {
        if (b == true) {
            return 1;
        }
        return 0;
    }
}
