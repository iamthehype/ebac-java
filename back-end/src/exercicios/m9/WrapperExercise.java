package exercicios.m9;

import java.util.Scanner;

public class WrapperExercise {
    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10");

        String userNum = userScanner.nextLine();
        Integer convertedNum = Integer.valueOf(userNum);

        System.out.println("Tipo: " + convertedNum.getClass().getName() + "\n" +
                "Valor: " + convertedNum);


    }
}
