import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    
    // To use methods from the Random library we create an instance of Random
    Random random = new Random();

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls() {

        // Create an ArrayList named "randoTen"
        ArrayList<Integer> randoTen = new ArrayList<Integer>();

        // --- generate random number 10 times ---
        for (int i = 0; i < 10; i++) {
            randoTen.add(random.nextInt(1,21));
        }
        return randoTen;
    }

    
    // Write a method that will:
    //    1.Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
    //    2.Generate a random index between 0-25 and use it to pull a random letter out of the array.
    //    3.Return the random letter.
    public String getRandomLetter() {
        
        // create an alphabet string to iterate through
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create an array to hold the letter
        String[] alphabetArray = new String[26];
        // for loop to set index and assign letter to "alphabetArray"
        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = String.valueOf(alphabet.charAt(i));
        }

        return alphabetArray[random.nextInt(26)];
    }

    
    // Write a method that uses the previous method to create a random string of eight characters and return that string.
    public String generatePassword() {
        
        // create and empty string to be filled and returned
        String newPassword = "";
        // loop 8 times calling the getRandomLetter to generate and push a letter to the newPassword
        for (int i = 0; i < 8; i++) {
            newPassword += getRandomLetter();
        }
        return newPassword;
    }


    // Write a method that takes an int length as an argument and creates an array of random eight-character words. The array should be the length passed in as an int. Return the array of passwords.
    public ArrayList<String> generatePasswordSet(int element) {
        
        // create instance of "ArrayList" to hold the generated passwords
        ArrayList<String> passwordSet = new ArrayList<String>();
        // loop to call the generatePassword and add to passwordSet each time
        for (int i=0; i<element; i++) {
            String newPassword = generatePassword();
            passwordSet.add(newPassword);
        }
        return passwordSet;
    }
}