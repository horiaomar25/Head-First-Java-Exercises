import java.util.Random;
public class PhraseOMatic {
    public static void main(String[] args) {

        // Make a 3 lists of words
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "extensible"};
        String[] wordListTwo = {"apple", "bin", "carrots", "defence", "elephant", "fantastic"};
        String[] wordListThree = {"alphabet", "best", "creative", "deny", "extract", "fake", "great"};

        // Check for phrase:
//        System.out.println(wordListOne[0]);

        // Find out how many words are in each list
        int oneLength = wordListOne.length; // Must be defined as a int. Get error when trying number types?
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Intializes the random number generator
        Random rand = new Random();

        // This means that the random number will be generated between 0 and max length of the array
        int ran1 = rand.nextInt(oneLength);
        int ran2 = rand.nextInt(twoLength);
        int ran3 = rand.nextInt(threeLength);

        // Concatenate a sentence together
        String alienSentence = wordListOne[ran1] + " " + wordListTwo[ran2] + " " + wordListThree[ran3];

        System.out.println(alienSentence);


    }
}
