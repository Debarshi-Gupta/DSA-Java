package Udemy.Module2_String;

public class Problem9_StringNormalisation {

    public static String stringNormalisation (String s) {

        StringBuilder result = new StringBuilder("");

        for (int i=0; i<s.length(); i++) {
            Character character = s.charAt(i);

            if (!Character.isLetter(character)) {
                result.append(character);
            }
            else {
                int index = i;
                while (index<s.length() && Character.isLetter(s.charAt(index))) {
                    index++;
                }
                String word = s.substring(i, index);
                String formattedWord = Character.toUpperCase(word.charAt(0)) +
                        word.substring(1).toLowerCase();
                result.append(formattedWord);
                i = index - 1;
            }
        }

        return result.toString();
    }

    public static void main (String[] args) {

        // This Is So Much Fun! I Want To Scream!!
        System.out.println(stringNormalisation("This is SO MUCH FUN! I want to scream!!"));

        // Hello, World!
        System.out.println(stringNormalisation("hELLO, wORLD!"));

        // Abc   Def
        System.out.println(stringNormalisation("aBC   dEF"));
    }
}
