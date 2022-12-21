package exercicios.m15;

public class CommonCarFactory extends Factory {
    @Override
    public Car create() {
        return new CommonCar("Ford", "Fusion",
                "Black", 2022, "Gasoline", "40L");
    }
}
