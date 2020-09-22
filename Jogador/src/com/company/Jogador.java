package com.company;
public class Jogador {
    private String nome;
    private int idade;
    private int anoDeNascimento;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;
    // Constante que contem o ano atual
    private final int ANOATUAL = 2020;

    Jogador(String nome, int idade, int anoDeNascimento, String posicao,
            String nacionalidade, double altura, double peso){
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = anoDeNascimento;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String retornaInformacoes(){
        String informacoes =
                "Infomações do Jogador: \n"+
                "Nome: "+this.nome+
                "\n" +"Idade: "+this.idade+
                "\n" + "Ano de nascimento: "+this.anoDeNascimento+
                "\n" + "Posicao: "+this.posicao+
                "\n" + "Nacionalidade: "+this.nacionalidade+
                "\n" + "Altura: "+this.altura+
                "\n" + "Peso: "+this.peso;
        return informacoes;
    }

    public int calcularIdade(){
        int idade = ANOATUAL - this.anoDeNascimento;
        return idade;
    }

    public String tempoRestanteDeCarreira(){
        if(this.posicao == "Atacante" || this.posicao == "atacante"){
            return "Faltam "+(35 - calcularIdade())+" anos para o jogador "+this.nome+"se aposentar";
        }else if(this.posicao == "Meio-campo" || this.posicao == "meio-campo"){
            return "Faltam "+(38 - calcularIdade())+" anos para o jogador "+this.nome+" se aposentar";
        }else if(this.posicao == "Defesa" || this.posicao == "defesa"){
            return "Faltam "+(40 - calcularIdade())+" anos para o jogador "+this.nome+"se aposentar";
        }else{
            // Caso a posição seja inválida
            return "Posição Inválida";
        }
    }

}
