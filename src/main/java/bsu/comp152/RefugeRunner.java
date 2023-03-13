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

    public RefugeRunner() {

        keyboard = new Scanner(System.in);
        refuge = null;
    }

    public void runRefuge(WildlifeRefuge wlr) {
        // FIXME


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
                    break;
                case 4:
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
        System.out.println("How many animals can " + newRehabilitatorName + " accommodate at one time?");
        newRehabilitatorMaxPatients = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What animals does " + newRehabilitatorName + " accept?");

        int animalSelection = 0;
        while (animalSelection != 1) {
//
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
        WildlifeRefuge newWildlifeRefuge = new WildlifeRefuge(20);
        Rehabilitator rehabilitator = new Rehabilitator(newRehabilitatorName, newWildlifeRefuge.getNextRehabilitatorId(),
                newRehabilitatorMaxPatients, acceptedAnimalList);
        newWildlifeRefuge.hireRehabilitator(rehabilitator);
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
        stayAfterInjuryTryCatch();

    }
    public void case3Helper() {

    }
    public void case4Helper() {

    }
    public void case5Helper() {

    }
    public void case6Helper() {

    }
    public void stayAfterInjuryTryCatch() {
        try {
            if (keyboard.nextLine().equalsIgnoreCase("y")) {
                stayAfterInjury = true;
            }
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                stayAfterInjury = false;
            }
        }
        catch (Exception exception) {
            stayAfterInjuryTryCatch();
        }

    }
}
