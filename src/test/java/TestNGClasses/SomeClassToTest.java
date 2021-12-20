package TestNGClasses;

public class SomeClassToTest {

    public int sumNumbers(int a, int b){
        return a + b;
    }

    public String addStrings(String a, String b){
        return a + " " + b;
    }

    public int[] getArray(){
        int[] intArray = new int[4];

        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;
        intArray[3]=4;

        return intArray;
    }



}
