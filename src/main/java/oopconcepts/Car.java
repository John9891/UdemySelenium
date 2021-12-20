package oopconcepts;

public class Car {
    // color
    private String color;
    // make
    private String make;
    // model
    private String model;
    // year
    private int year;

    int speed;
    int gear;

    public Car(){

        this(59, 34);
        this.speed = 0;
        this.gear = 100;
        System.out.println("Executing constructor without arguments");
    }

    public Car(int speed, int gear){

        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with arguments");

    }


    public void increaseSpeed() {
        System.out.println("Increasing the speed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1990){
            this.year = year;
        }
        else{
            System.out.println("Year is not valid - car too old");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
