package com.company;

public class Livro {
    private String titulo;
    private String isbn;
    private String materia;
    private int anoDePublicacao;

    // Construtor (entrada com todas as informações)
    Livro(String titulo, String isbn, String materia, int anoDePublicacao){
        this.titulo = titulo;
        this.isbn = isbn;
        this.materia = materia;
        this.anoDePublicacao = anoDePublicacao;
    }

    // Overloading (Sem o ano de publicação)
    Livro(String titulo, String isbn, String materia){
        this.titulo = titulo;
        this.isbn = isbn;
        this.materia = materia;
        this.anoDePublicacao = 2019;
    }

    // função para mostrar informações do Livro
    public String mostrarInformacoes(String tituloOuIsbn){
        String informacoes = ("Titulo Do livro: "+(this.titulo)+ " | ISBN: " + (this.isbn) + " | Materia: " +
                (this.materia) + " | Ano de publicação: "+(this.anoDePublicacao));
        if(tituloOuIsbn == this.titulo || tituloOuIsbn == this.isbn){
            return informacoes;
        }
        else {
            return "Erro: esse não é o livro buscado ;/ !!!";
        }
    }

    // Getters e Setters da classe

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}