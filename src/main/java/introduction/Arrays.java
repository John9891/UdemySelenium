package introduction;

public class Arrays {

    public static void main(String[] args) {

        int[] myIntArray1;
        myIntArray1 = new int[10];

        myIntArray1[0] = 100;
        myIntArray1[1] = 90;

        System.out.println("0 index is " + myIntArray1[0]);
        System.out.println("1st index is " + myIntArray1[1]);
        System.out.println("2nd index is " + myIntArray1[2]);

        String[] myStringArray1 = {"volskwagen","audi", "chevrolet"};

        System.out.println("0 index is " + myStringArray1[0]);
        System.out.println("1st index is " + myStringArray1[1]);
        System.out.println("2nd index is " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Length of int array is " + len1);
        System.out.println("Length of str array is " + len2);

    }
}
