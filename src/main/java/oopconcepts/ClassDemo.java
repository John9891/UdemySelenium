package oopconcepts;

public class ClassDemo {

    public static void main(String[] args) {
        Car bmw = new Car(); // Create and initialize the object
        bmw.setMake("BMW");
        bmw.setColor("blue");
        bmw.setModel("2021");
        bmw.setYear(1991);
        System.out.println(bmw.getMake());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getModel());
        System.out.println(bmw.getYear());
    }
}