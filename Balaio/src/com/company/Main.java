package com.company;

public class Main {

    public static void main(String[] args) {
        Livro l1 = new Livro("POO", "921", "Programação");
        Assinante a1 = new Assinante("Alvaro", "123","Rua sei la" ,"71","92134337");
        System.out.println(l1.mostrarInformacoes("POO"));
        System.out.println(a1.mostrarInformacoes("92134337"));
    }
}