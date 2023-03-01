package bsu.comp152;

import java.util.ArrayList;

/**
 * Main -
 * A class for Project 3, COMP 152
 *
 *  The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 * Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 * Completed by: Andrew Janedy, ajanedy@student.bridgew.edu, [date of completion]
 */
public class Main {
    public static void main(String[] args) {
        // Create an empty refuge.
        WildlifeRefuge massaoitNationalWF = new WildlifeRefuge(20);
        // Create an ArrayList for allowed animal types.
        ArrayList<String> animalTypes = new ArrayList<String>();
        // Allow turtles, salamanders, and bobcats.
        animalTypes.add("turtle");
        animalTypes.add("salamander");
        animalTypes.add("bobcat");
        // Create a rehabilitator who can work with these animal types.
        Rehabilitator rehabilitator = new Rehabilitator("Suzy Lin", massaoitNationalWF.getNextRehabilitatorId(), 10, animalTypes);
        // Hire the rehabilitator.
        massaoitNationalWF.hireRehabilitator(rehabilitator);
        // Create an ArrayList for allowed animal types for another rehabilitator.
        ArrayList<String> animalTypes2 = new ArrayList<String>();
        // Allow birds and deer.
        animalTypes2.add("bird");
        animalTypes2.add("deer");
        // Create a rehabilitator who can work with these animal types.
        Rehabilitator rehabilitator2 = new Rehabilitator("Jada Harvey", massaoitNationalWF.getNextRehabilitatorId(), 10, animalTypes2);
        // Hire the rehabilitator.
        massaoitNationalWF.hireRehabilitator(rehabilitator2);
        // Create an animal with two injuries.
        // First create a list for the injuries.
        ArrayList<String> injuryList = new ArrayList<String>();
        // Add the injuries into the list.
        injuryList.add("broken leg");
        injuryList.add("scratched paw");
        // Create an animal of type bobcat with these injuries that does not need to stay when healthy.
        Animal initialAnimal = new Animal("bobcat", injuryList, false);
        // Admit the animal to the refuge.
        massaoitNationalWF.admitAnimal(initialAnimal);
        // Create an animal with one injury.
        // First create a list for the injury.
        ArrayList<String> injuryList2 = new ArrayList<String>();
        // Add the injury into the list.
        injuryList2.add("broken foot");
        // Create an animal of type turtle with this injury that does not need to stay when healthy.
        Animal animal = new Animal("turtle", injuryList2, false);
        // Admit the animal to the refuge.
        massaoitNationalWF.admitAnimal(animal);
        // Create a runner to control the user-facing menu.
        RefugeRunner runner = new RefugeRunner();
        // Run the refuge.
        runner.runRefuge(massaoitNationalWF);
    }
}