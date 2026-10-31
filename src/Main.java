import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<keystroke> translated = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int lineCapacity = 20;

        System.out.println("Please enter a sentence: ");
        String input = scan.nextLine();

        int i = 0;
        while (i < input.length()) {
            char letter = input.charAt(i);
            // System.out.println("letter: " + letter);
            keystroke next = new keystroke(letter);
            translated.add(next);
            i++;
        }

        int j = 0;
        int translatedLength = 0;
        while (j < translated.size()) {
            translatedLength += translated.get(j).getnumKeys();
            j++;
        }

        int k = 0;
        while (k < translated.size()) {
            translated.get(k).convert();
            k++;
        }

    }





} //end Main

