package bsu.comp152;

import java.util.ArrayList;

/**
 * Animal -
 * A class for Project 3, COMP 152
 *
 * The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 *  Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 *
 * Completed by: Andrew Janedy, ajanedy@student.bridgew.edu, [date of completion]
 */
public class Animal {

    private String type;
    private boolean stayWhenHealthy;
    private ArrayList<String> injuries;
    private Rehabilitator assignedRehabilitator;

    public Animal(String ty, ArrayList<String> inj, boolean stay) {

        type = ty;
        stayWhenHealthy = stay;
        injuries = inj;
        assignedRehabilitator = null;
    }

    public String getType () {

        return this.type;
    }

    public boolean shouldKeepWhenHealthy () {

        return this.stayWhenHealthy;
    }

    public ArrayList<String> getInjuries () {

        return this.injuries;
    }

    public boolean shouldBeReleased () {

        return this.stayWhenHealthy;
    }

    @Override
    public String toString () {

        String willStay = " and will be kept after treatment.";
        String willNotStay = " and will be released after treatment;";
        String returnStay = "";
        if (stayWhenHealthy) {
            returnStay = willStay;
        }
        else {
            returnStay = willNotStay
        }

        return "This " + this.type + " will be treated by " + this.assignedRehabilitator + " for "
                + this.injuries + returnStay;
    }

    public void setRehabilitator(Rehabilitator rehabilitator) {
        try {
            rehabilitator.acceptsAnimalType(this.type);
            assignedRehabilitator = rehabilitator;
        }
        catch (IllegalArgumentException) {

        }
    }
    public void healInjury(String injuryName) {
        try {
            this.injuries.remove(injuryName)
        }
        catch (IllegalArgumentException) {

        }
    }
}