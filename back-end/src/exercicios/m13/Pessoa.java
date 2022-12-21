package exercicios.m13;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;

    public Pessoa(String nome, String sobrenome, Integer idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }
}
