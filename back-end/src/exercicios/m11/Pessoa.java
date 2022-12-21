package exercicios.m11;

public class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    @Override
    public String toString(){
        return String.join(" " ,
                "\n",
                "Nome:", this.nome,
                "\n",
                "Sexo:", this.sexo,
                "\n",
                "Idade:", String.valueOf(this.idade)
        );
    }

    public Pessoa(String nome, String sexo, Integer idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}