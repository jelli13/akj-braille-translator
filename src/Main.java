/** A program for "translating" written input into keystrokes on the Perkins brailler
 *
 * Notes:
 * Number sign isn't implemented 100% correctly. If the desired output is "#12345", the program will
 * instead output "#1#2#3#4#5". In other words, it does not account for consecutive numbers and the
 * number signs since letters and numbers share the same braille codes.
 *
 * Quotation marks vs question marks - same braille sign?
 *
 * @author Jemimah Lee
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<keystroke> translated = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int lineCapacity = 20;

        System.out.println("Please enter a sentence: ");
        String input = scan.nextLine();

        // adding keys to the arraylist
        int i = 0;
        while (i < input.length()) {
            char letter = input.charAt(i);
            // System.out.println("letter: " + letter);
            keystroke next = new keystroke(letter);
            translated.add(next);
            i++;
        }

        // wrapping text; making sure number of keys in a line doesnt exceed capacity
        int currentLineLength = 0;
        for (keystroke key : translated) {
            if (currentLineLength + key.getnumKeys() <= lineCapacity) {
                key.convert();
                currentLineLength += key.getnumKeys();
            } else {
                keystroke.lineSpacer();
                key.convert();
                currentLineLength = key.getnumKeys();
            }
        }
    }

} //end Main

