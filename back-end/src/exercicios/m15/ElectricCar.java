package exercicios.m15;

public class ElectricCar extends Car {

    private String model;
    private String batteryAutonomy;
    public ElectricCar(String brand, String name, String color, int year, String model, String batteryAutonomy) {
        super(brand, name, color, year);
        this.model = model;
        this.batteryAutonomy = batteryAutonomy;
    }

    @Override
    public void welcome() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("This is: " + getBrand() + "/" + getName() );
    }
}
