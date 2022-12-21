package exercicios.m15;

public class ElectricCarFactory extends Factory{
    @Override
    public Car create() {
            return new ElectricCar("Tesla",
                                    "Model S",
                                    "Red", 2022,"Sport","450 KM");
        }
    }


