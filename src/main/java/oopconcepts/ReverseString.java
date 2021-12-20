package oopconcepts;

public class ReverseString {

    public static void main(String[] args) {

        String input = "This is a test";
        String output = reverseString(input);
        System.out.println(output);

    }

    public static String reverseString(String input){

        String reverse = "";

        if (input.length() <= 1) {
            reverse = input;
        }else{
            String[] originalArray = input.split("\\s+");
            for (String word:originalArray) {
                reverse = word + " " + reverse;
            }
        }

        return reverse;

    }

}
