package exercicios.m11;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ColecoesParteDois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pessoas deseja cadastrar? ");

        int quantity = scan.nextInt();

        List<String[]> registers = new ArrayList<String[]>();
        List<Pessoa> man = new ArrayList<Pessoa>();
        List<Pessoa> woman = new ArrayList<Pessoa>();

        System.out.println("Digite nome, sexo e idade delimitados por ;");

        while(registers.size() <= quantity) {
            String result = scan.nextLine();
            registers.add(result.split(";"));
        }

        for(String[] array : registers) {
            for(String element : array) {
                if (element.equalsIgnoreCase("masculino")){
                    man.add(new Pessoa(array[0], array[1], Integer.parseInt(array[2])));
                } else if (element.equalsIgnoreCase("feminino")) {
                    woman.add(new Pessoa(array[0], array[1], Integer.parseInt(array[2])));
                }
            }
        }

        System.out.println("Homens: " + man);
        System.out.println("Homens: " + woman);


    }
}