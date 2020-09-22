package com.company;

public class Assinante {
    private String nome;
    private String cpf;
    private String endereco;
    private String ddd;
    private String telefone;

    // Construtor (entrada com todos os atributos)
    Assinante(String nome, String cpf, String endereco, String ddd, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    // Overloading (quando não informar ddd)
    Assinante(String nome, String cpf, String endereco, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.ddd = "71";
        this.telefone = telefone;
    }

    // função para mostrar informações do assinante do Balaio
    public String mostrarInformacoes(String nomeOuTelefoneSemDdd){
        String informacao = ("Nome: "+this.nome+" | CPF: "+this.cpf+" | Endereco: "
                +this.endereco+" | Telefone: ("+this.ddd+") "+this.telefone);
        if(this.nome == nomeOuTelefoneSemDdd || this.telefone == nomeOuTelefoneSemDdd
                || (this.ddd+this.telefone).equals(nomeOuTelefoneSemDdd)){
            return informacao;
        }
        else{
            return "ERRO|||";
        }
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}