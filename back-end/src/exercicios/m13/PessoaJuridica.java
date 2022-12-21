package exercicios.m13;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, String sobrenome, Integer idade, String cnpj) {
        super(nome, sobrenome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }
}
