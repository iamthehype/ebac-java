package exercicios.m7.models;

public class Carro {

    /*
    Esta classe representa um objeto (simples) do mundo real
    Seu objetivo é acadêmico :)
    **/

    private final String nome;
    private final String cor;
    private final String modelo;
    private final int ano;

    private String observacao = null;

    public Carro(String nome, String cor, String modelo, int ano){
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCor(){
        return this.cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getObservacao(){
        return this.observacao;
    }

    public void setObservacao(String obs){
        this.observacao = obs;
    }

    public void acelerar(int velocidade){

        // função responsável por colocar o carro em movimento

        System.out.println("Estou acelerando a " + velocidade + " km/h" );
    }

    public void freiar(){

        // Função responsável por parar o carro

        System.out.println("Acabei de freiar o carro");
    }

}
