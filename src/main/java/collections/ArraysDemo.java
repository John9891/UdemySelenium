package collections;

/* Arrays:
Fixed in size
Fast for data retrivals
Compact memory usage if size is known
Delete operation very hard
2D Arrays
*/

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
    }
}
