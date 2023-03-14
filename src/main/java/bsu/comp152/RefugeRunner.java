package bsu.comp152;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * RefugeRunner -
 * A class for Project 3, COMP 152
 *
 * The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 * Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 * Completed by: Andrew Janedy, ajanedy@student.bridgew.edu, [date of completion]
 */
public class RefugeRunner {
    Scanner keyboard;
    private WildlifeRefuge refuge;
    int selection = 0;
    String newRehabilitatorName = "";
    int newRehabilitatorMaxPatients = 0;
    String acceptedAnimal = "";
    ArrayList<String> acceptedAnimalList = new ArrayList<String>();
    ArrayList<String> injuryList = new ArrayList<String>();
    boolean stayAfterInjury;
    String answer = "";

    public RefugeRunner() {

        keyboard = new Scanner(System.in);
        refuge = null;
    }

    public void runRefuge(WildlifeRefuge wlr) {

        refuge = wlr;
        while (selection != 7) {

            System.out.println();
            System.out.println("Welcome to Wildlife Refuge");
            System.out.println("===========================");
            System.out.println("Would you like to...");
            System.out.println("1: Hire a wildlife rehabilitator.");
            System.out.println("2: Admit an animal");
            System.out.println("3: Look up a rehabilitator");
            System.out.println("4: Print list of animals");
            System.out.println("5: Print a list of rehabilitators");
            System.out.println("6: Release animals");
            System.out.println("7: Exit");
            System.out.println("Please enter a number 1-7");
            selection = keyboard.nextInt();
            keyboard.nextLine();

            switch (selection) {

                case 1:
                    case1Helper();
                    break;
                case 2:
                    case2Helper();
                    break;
                case 3:
                    case3Helper();
                    break;
                case 4:
                    case4Helper();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("See you next time!");
                    break;

            }
        }
    }
    public void case1Helper() {
        System.out.println("Enter the name of the rehabilitator you would like to hire: ");
        newRehabilitatorName = keyboard.nextLine();

        while (newRehabilitatorMaxPatients == 0) {
            System.out.println("How many animals can " + newRehabilitatorName + " accommodate at one time?");
            try {
                //keyboard.next();
                newRehabilitatorMaxPatients = keyboard.nextInt();
                //keyboard.next();
            } catch (Exception exception) {
                System.out.println("Please enter a valid number");
                keyboard.nextLine();
            }
        }

        newRehabilitatorMaxPatients = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What animals does " + newRehabilitatorName + " accept?");
        int animalSelection = 0;
        while (animalSelection != 1) {
        // FIXME : clear buffer
            try {
                animalSelection = keyboard.nextInt();
            }
            catch (Exception exception) {
                acceptedAnimal = keyboard.nextLine();
                acceptedAnimalList.add(acceptedAnimal);
                System.out.println("You have added " + acceptedAnimal + " to the list of accepted animals");
                System.out.println("Enter another animal or press 1 when completed");
            }
        }
        Rehabilitator rehabilitator = new Rehabilitator(newRehabilitatorName, refuge.getNextRehabilitatorId(),
                newRehabilitatorMaxPatients, acceptedAnimalList);
        refuge.hireRehabilitator(rehabilitator);
        System.out.println("You hired " + rehabilitator);
    }

    public void case2Helper() {
        String admittedAnimal = "";
        String newInjury = "";
        System.out.println("What type of animal is being admitted?");
        admittedAnimal = keyboard.nextLine();
        System.out.println("What injuries has the " + admittedAnimal + " sustained?");
        int injurySelection = 0;
        while (injurySelection != 1) {
//
            try {
                injurySelection = keyboard.nextInt();
            }
            catch (Exception exception) {
                newInjury = keyboard.nextLine();
                injuryList.add(newInjury);
                System.out.println("You have added " + newInjury + " to the list of injuries");
                System.out.println("Enter another injury or press 1 when completed");
            }
        }
        System.out.println("Should the animal be kept after it is fully healed (press 'y' for yes and 'n' for no)?");
        keyboard.nextLine();
        answer = keyboard.nextLine();
        stayAfterInjuryMethod();
        Animal animal = new Animal(admittedAnimal, injuryList, stayAfterInjury);
        System.out.println(animal);

        // TODO : Add the animal to the rehabilitator who is qualified and has the most available
        //  capacity. This will require checking every potential rehabilitator's availability.

    }
    public void case3Helper() {
        int idNumberToCheck;
        System.out.println("What is the ID number of the rehabilitator you would like to look up?");
        idNumberToCheck = keyboard.nextInt();
        if (refuge.getRehabilitatorById(idNumberToCheck) == null) {
            System.out.println("The input is not valid");
        }

        // TODO : If the rehabilitator is null, print "The input is not valid."
        //  Otherwise enter the rehabilitator menu. (See below.)
    }
    public void case4Helper() {
        refuge.getAnimals();
    }
    public void case5Helper() {

    }
    public void case6Helper() {

    }
    public void stayAfterInjuryMethod() {

        if (answer.equalsIgnoreCase("y")) {
            stayAfterInjury = true;
        }
        else if (answer.equalsIgnoreCase("n")) {
            stayAfterInjury = false;
        }
        else {
            System.out.println("Please enter a valid input");
            System.out.println("Should the animal be kept after it is fully healed (press 'y' for yes and 'n' for no)?");
            answer = keyboard.nextLine();
            stayAfterInjuryMethod();
        }
    }
}
