package exercicios.m12;

import exercicios.m11.Pessoa;

import java.util.*;

public class TarefaColecoes {
    public static void main(String[] args) {

        // Ordenação de nomes

        int quantidadeDeNomes;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os nomes, separado por virgula" + "\n");

        String[] results = scan.nextLine().split(",");
        List<String> nomes = new ArrayList<String>(Arrays.stream(results).toList());

        Collections.sort(nomes);

        System.out.println(nomes);

        // Separação de grupos masculinos e femininos

        int quantidadeDeRegistros = scan.nextInt();

        List<String[]> registros = new ArrayList<String[]>();
        List<Pessoa> homens = new ArrayList<Pessoa>();
        List<Pessoa> mulheres = new ArrayList<Pessoa>();

        System.out.println("Digite nome, sexo e idade delimitados por ,");

        while(registros.size() <= quantidadeDeRegistros) {
            String result = scan.nextLine();
            registros.add(result.split(","));
        }

        for(String[] array : registros) {
            for(String element : array) {
                if (element.equalsIgnoreCase("masculino")){
                    homens.add(new Pessoa(array[0], array[1], Integer.parseInt(array[2])));
                } else if (element.equalsIgnoreCase("feminino")) {
                    mulheres.add(new Pessoa(array[0], array[1], Integer.parseInt(array[2])));
                }
            }
        }

        System.out.println("Homens: " + homens);
        System.out.println("Homens: " + mulheres);

    } // end of main fun
}
