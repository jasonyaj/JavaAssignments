import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		
        // Instance of PuzzleJava named "generator"
        PuzzleJava generator = new PuzzleJava();

		// ******** Test getTenRolls ********
        // ArrayList<Integer> randomRolls = generator.getTenRolls();
		// System.out.println("Random number: " + randomRolls);

		
		// ******** Test getRandomLetter ********
        // System.out.println("Random letter: " + generator.getRandomLetter());
		
        
        // ******** Test generatePassword ********
        // System.out.println(generator.generatePassword());


        // ******** Test generatePasswordSet ********
        System.out.println("How many passwords would you like to create: ");
        // line to allow user to enter amount in the console
        String enteredNumber = System.console().readLine();
        // convert string to int
        int numberOfPasswords = Integer.valueOf(enteredNumber);
        // insert int as parameter when calling generatePasswordSet
        System.out.println(generator.generatePasswordSet(numberOfPasswords));
	}
}
