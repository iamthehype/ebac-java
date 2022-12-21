package exercicios.m15;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        ArrayList<Request> requests = new ArrayList<>(
                Arrays.asList(new Request("Common"), new Request("Electric"))
        );

        for(Request request : requests){
            Factory fac = getFactoru(request);
            Car car = fac.create();
            car.welcome();
        }
    }

    public static Factory getFactoru(Request request) {
        if (request.getRequest().equalsIgnoreCase("electric")) {
            return new ElectricCarFactory();
        } else {
            return new CommonCarFactory();
        }
    }
}