package collections;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("yellow");
        colors.add("1");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("red"));

        for (String color: colors) {
            System.out.println(color);
        }
        
    }
}
