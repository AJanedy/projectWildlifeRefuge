package bsu.comp152;

import java.util.ArrayList;

/**
 * WildlifeRefuge -
 * A class for Project 3, COMP 152
 *
 *  The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 * Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 * Completed by: Andrew Janedy, ajanedy@student.bridgew.edu, [date of completion]
 */
public class WildlifeRefuge {

    private int maxAnimals;
    private int nextRehabilitatorId;
    private ArrayList<Rehabilitator> rehabilitators;

    public WildlifeRefuge(int max) {

        maxAnimals = max;
        nextRehabilitatorId = 1;
        rehabilitators = new ArrayList<Rehabilitator>();
    }

    public int getMaxAnimals() {

        return this.maxAnimals;
    }

    public int getNextRehabilitatorId() {

        return nextRehabilitatorId;
    }

    ArrayList<Rehabilitator> getRehabilitators() {

        return this.rehabilitators;
    }

    public Rehabilitator getRehabilitatorById(int id) {
        //FIXME
        // ~The getRehabilitatorById method should take one parameter. It should return the
        //  rehabilitator with the id given by the parameter or return null if there is no
        //  rehabilitator with that id. That is,
        // ~~Loop through the rehabilitators. Call the getIdNumber method on each one to see
        //   if the returned value is equal to the given id. If it is, return the rehabilitator.
        // ~~Next (if the code gets to that point), return null.
        return null;
    }

    public int getTotalAnimals() {
        //FIXME
        // ~The getTotalAnimals method should take no parameters. It should return a count of all
        //  animals that all rehabilitators have. That is,
        // ~~Initialize a sum of animals to 0.
        // ~~Loop through the rehabilitators. On each one, call the getCurrentAnimals method and call
        //   the size method on the returned ArrayList (to find out how many animals the rehabilitator
        //   currently has). Add this number onto the running sum.
        return 0;
    }

    public ArrayList<Animal> getAnimals() {
        //FIXME
        // ~The getAnimals method should take no parameters.  It should return an ArrayList of all
        //  animals that all rehabilitators have. That is,
        // ~~Do an inline initialization of an ArrayList animals of Animal objects with ArrayList
        //   animals = new ArrayList();.
        // ~~Loop through the list of current animals that each rehabilitator has and add each animal
        //   one-by-one to the animals list. This can be done with a nested loop.
        // ~~Return the animals list.
        return null;
    }

    public void hireRehabilitator(Rehabilitator newHire) {
        //FIXME
        // ~The hireRehabilitator method should take one parameter.
        // ~It should add the parameter to the instance variable rehabilitators.
        // ~It should increment the instance variable nextRehabilitatorId.

    }

    public void admitAnimal(Animal animal) {
        //FIXME
        // ~The admitAnimal method should take one parameter.
        // ~If the refuge is full, throw an exception. (You can call the getTotalAnimals method,
        //  and if adding 1 to it would exceed the maxAnimals instance variable, then throw an
        //  IllegalStateException.)
        // ~If there are no rehabilitators hired at this wildlife refuge, throw an exception.
        //  (You can call the size method on the instance variable rehabilitators. If it's 0, then
        //  throw an IllegalStateException.)
        // ~Check if the animal type is accepted by a rehabilitator. You could:
        // ~~Call the getType method on the animal parameter and store it in a variable like type
        //   for convenience.
        // ~~Declare a boolean flag typeAccepted and initialize it to false.
        // ~~Loop through the rehabilitators. Call the acceptsAnimalType method on each one,
        //   passing type as an argument, to see if the animal's type is accepted by the
        //   rehabilitator. If it is, overwrite typeAccepted with true.
        // ~If no rehabilitator accepts this animal type, throw an IllegalStateException.
        // ~Add the animal to the rehabilitator who is qualified and has the most available capacity.
        //  You could:
        // ~~Initialize 0 as the bestCapacity, declared as an int, and assign the 0th rehabilitator
        //   as the best rehabilitator.
        // ~~Check every potential rehabilitator's suitability and availability. (Loop through the
        //   rehabilitators. On each one, call getAnimalInjuryCapacity to get their capacity. If the
        //   rehabilitator accepts the animal type, and the capacity exceeds the bestCapacity seen so
        //   far, then overwrite the best rehabilitator with that rehabilitator and the bestCapacity
        //   their capacity.)
        // ~~Add the animal to the best rehabilitator.

    }

    public ArrayList<Animal> releaseAnimals() {
        //FIXME
        // ~The releaseAnimals method should take no parameters.
        // ~It should do an inline initialization of an ArrayList to store the animals to release
        //  with ArrayList animalsToRelease = new ArrayList();.
        // ~Loop through the rehabilitators. On each one, call the releaseAnimals method. Loop
        //  through the list of released animals that is returned and add each animal one-by-one
        //  to the animalsToRelease list. This can be done with a nested loop.
        // ~Return the animalsToRelease list.
        return null;
    }
}
