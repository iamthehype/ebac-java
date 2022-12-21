package exercicios.m7.app;

import exercicios.m7.models.Carro;

public class Main {

    public static void main(String[] args){

        Carro meuCarro = new Carro("HB20","Preto", "Hatch", 2022);

        meuCarro.setObservacao("É um carro legal :)");

        String msg = String.join(" " ,
                       "\n",
                                "carro:", meuCarro.getNome(),
                                "\n",
                                "Modelo:", meuCarro.getModelo(),
                                "\n",
                                "Ano:", String.valueOf(meuCarro.getAno()),
                                "\n",
                                "Cor:", meuCarro.getCor(),
                                "\n",
                                "OBS:", meuCarro.getObservacao()
        );

        System.out.println(msg);

    }
}
