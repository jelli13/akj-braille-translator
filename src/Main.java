//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String input = scan.nextLine();
        String result = translate(input);
        System.out.println(result);
    }

    public static String translate(String input) {
        int i = 0;
        String translated = "";
        while (i < input.length()) {
            char letter = input.charAt(i);
            System.out.println("letter: " + letter);
            translated = translated.concat(convert(input.charAt(i)));
            i++;
        }
        return translated;
    }

    public static String convert(char character){
        /* if (character >= '0' && character <= '9') {
            convertNumber(character);
        }  else if (character >= 'A' && character <= 'Z') {
            convertUpper(character);
        } else */ if (character >= 'a' && character <= 'z') {
            return convertLower(character);
        } /* else if (character == 32) {
            return " ";
    }
    convertBlock(character); */
        return " ";
    }

    public static String convertLower(char c) {
        char brailleChar = switch (c) {
            case 'a' -> '\u2801'; // ⠁
            case 'b' -> '\u2803'; // ⠃
            case 'c' -> '\u2809'; // ⠉
            case 'd' -> '\u2819'; // ⠙
            case 'e' -> '\u2811'; // ⠑
            case 'f' -> '\u280B'; // ⠋
            case 'g' -> '\u281B'; // ⠛
            case 'h' -> '\u2813'; // ⠓
            case 'i' -> '\u280A'; // ⠊
            case 'j' -> '\u281A'; // ⠚
            case 'k' -> '\u2805'; // ⠅
            case 'l' -> '\u2807'; // ⠇
            case 'm' -> '\u280D'; // ⠍
            case 'n' -> '\u281D'; // ⠝
            case 'o' -> '\u2815'; // ⠕
            case 'p' -> '\u280F'; // ⠛ (⠏)
            case 'q' -> '\u281F'; // ⠟
            case 'r' -> '\u2817'; // ⠗
            case 's' -> '\u280E'; // ⠎
            case 't' -> '\u281E'; // ⠞
            case 'u' -> '\u2825'; // ⠥
            case 'v' -> '\u2827'; // ⠧
            case 'w' -> '\u283A'; // ⠺
            case 'x' -> '\u282D'; // ⠭
            case 'y' -> '\u283D'; // ⠽
            case 'z' -> '\u2835'; // ⠵
            default  -> '\u2800'; // Blank braille for non-letters
        };

        return String.valueOf(brailleChar);
    }




}

