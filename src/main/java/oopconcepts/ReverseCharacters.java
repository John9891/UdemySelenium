package oopconcepts;

public class ReverseCharacters {

    public static void main(String[] args) {

        String input = "This is a test";
        String output = reverseCharacters(input);
        System.out.println(output);

    }

    public static String reverseCharacters(String input){

        String reverse = "";

        if (input.length() <= 1) {
            reverse = input;
        }else{
            for (int i = 0; i < input.length(); i++) {
                reverse = input.charAt(i) + reverse;
            }
        }

        return reverse;

    }



}
