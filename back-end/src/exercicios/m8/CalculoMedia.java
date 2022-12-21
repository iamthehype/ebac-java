package exercicios.m8;

import java.util.Arrays;

public class CalculoMedia {

    public static void main(String[] args){

        int[] notas = {10, 8, 6, 4};

        String msgMedia = String.format("A Média da nota é: %s",
                (Arrays.stream(notas).sum() / Arrays.stream(notas).count()));

        System.out.println(msgMedia);

    }
}
