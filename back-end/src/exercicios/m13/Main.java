package exercicios.m13;

public class Main {
    public static void main(String[] args){

        PessoaFisica pf = new PessoaFisica("Lucas", "Martins", 31,"111-222-333-44");

        PessoaJuridica pj = new PessoaJuridica("Ebac", "Online", 81, "1111-2222-3333-4444");

        System.out.println("pf: " + pf.getCpf());

        System.out.println("pj: " + pj.getCnpj());

    }
}


