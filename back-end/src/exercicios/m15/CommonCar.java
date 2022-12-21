package exercicios.m15;

public class CommonCar extends Car {

    private String fuelType;
    private String fuelTank;
    public CommonCar(String brand, String name, String color, int year, String fuelType, String fuelTank){
        super(brand, name, color, year);
        this.fuelType = fuelType;
        this.fuelTank = fuelTank;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    @Override
    public void welcome() {
        System.out.println("Class: " + getClass().getSimpleName());
        System.out.println("This is: " + getBrand() + "/" + getName());
    }
}
