package bsu.comp152;
import java.sql.SQLOutput;
import java.util.Scanner;

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

    public RefugeRunner() {

        keyboard = new Scanner(System.in);
        refuge = null;
    }

    public void runRefuge(WildlifeRefuge wlr) {
        // FIXME
        int selection = 0;

        while (selection != 7) {
        }
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
                    break;
                case 2:
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
