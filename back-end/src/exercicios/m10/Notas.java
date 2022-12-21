package exercicios.m10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> notas = new ArrayList<Integer>();

        while(notas.size() < 4) {
            int count = notas.size() == 0 ? 1 : notas.size() + 1;
            System.out.println("Por favor, digite a " + count + " nota" + "\n");
            notas.add(scan.nextInt());
        }

        double total = notas.stream().reduce(0, Integer::sum);
        double media = total / notas.size();

        System.out.println("Média: " + media);

        if (media >= 7){
            System.out.println("Parabéns, você está aprovado!");
        } else if (media >= 5) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você está reprovado :(");
        }
    }
}
