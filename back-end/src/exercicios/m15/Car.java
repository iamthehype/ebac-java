package exercicios.m15;

public abstract class Car {
    private String brand;
    private String name;
    private String color;
    private int year;

    public Car(String brand, String name, String color, int year) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void starEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The: " + this.brand + "/" + this.name + "/" + this.year + " engine has been started");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic. Everything looks good!");
    }

    public abstract void welcome();
}
