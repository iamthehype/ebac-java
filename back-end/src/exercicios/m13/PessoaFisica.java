package exercicios.m13;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String sobrenome, Integer idade, String cpf) {
        super(nome, sobrenome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

}
