package bsu.comp152;

import java.util.ArrayList;

/**
 * Rehabilitator -
 * A class for Project 3, COMP 152
 *
 *  The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 *  Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 * Completed by: Andrew Janedy, ajanedy@student.bridgew.edu, [date of completion]
 */
public class Rehabilitator {

    private String name;
    private int idNumber;
    private int maxAnimalInjuries;
    private ArrayList<String> acceptedAnimalTypes;
    private ArrayList<String> currentAnimals;

    public Rehabilitator(String nm, int id, int maxInjuries, ArrayList<String> acceptedTypes) {

        name = nm;
        idNumber = id;
        maxAnimalInjuries = maxInjuries;
        acceptedAnimalTypes = acceptedTypes;
        currentAnimals = new ArrayList<Animal>();
    }

    public String getName() {

        return this.name;
    }

    public int getIdNumber() {

        return this.idNumber;
    }

    public int getMaxAnimalInjuries() {

        return this.maxAnimalInjuries;
    }

    public ArrayList<String> getAcceptedAnimalTypes() {

        return this.acceptedAnimalTypes;
    }

    public ArrayList<Animal> getCurrentAnimals() {

        return this.currentAnimals;
    }

    public boolean acceptsAnimalType(String type) {

        return acceptedAnimalTypes.contains(type);
    }

    public int getAnimalInjuryCapacity() {

        private int currentInjuries = 0;
        //FIXME
        // create for loop to count injuries
        for (Animal i : currentAnimals) {

        }
        return maxAnimalInjuries - currentInjuries;
    }

    @Override
    public String toString() {

        return this.name + ", ID number: " + this.idNumber + " has a maximum caseload of " +
                this.maxAnimalInjuries + " injuries.  " + this.name + " accepts "
                + this.acceptedAnimalTypes + " and currently has a caseload of "
                + getAnimalInjuryCapacity();
    }

    public ArrayList<Animal> getInjuredAnimals() {

        //FIXME
        // ~Return a list of animals with injuries
        return null;
    }

    public ArrayList<Animal> releaseAnimals() {
        //FIXME
        // ~This will call the shouldBeReleased method on each animal in the list of current animals
        // ~If the animal should be released, add it to a list of animals to be released
        // ~Then, loop through the list of animals to be released and remove each animal from the current
        //  animals. (Do not modify a list while iterating over it)
        // ~Return the list of animals released
        return null;
    }

    public void setMaxAnimalInjuries(int max) {
        //FIXME
        // ~If the new maximum value is less than the current number of injuries the rehabilitator
        // is responsible for, throw an IllegalArgumentException.
        // ~Update the instance variable maxAnimalInjuries to the value of the parameter.
    }

    public void addAcceptedAnimalType(String type) {
        //FIXME
        // ~Add the animal type given by the parameter to the instance variable list acceptedAnimalTypes.
    }

    public void addAnimal(Animal animal) {
        //FIXME
        // ~If the rehabilitator's list of accepted animal types does not contain the animal's type,
        //  then throw an IllegalArgumentException.
        // ~If the number of injuries the animal has would cause the rehabilitator to exceed their
        //  maximum animal injuries allowed, then throw an IllegalStateException, meaning the program
        //  won't put the rehabilitator into a state that's not allowed (a state of caring for a
        //  number of injuries that exceeds the maximum).
        // ~Add the animal to the instance variable currentAnimals.
    }
}
