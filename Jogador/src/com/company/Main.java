package com.company;

public class Main {

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar", 22, 1998,
                "atacante", "Brasil", 1.80, 80);
        System.out.println(j1.retornaInformacoes());
        System.out.println(j1.calcularIdade());
        System.out.println(j1.tempoRestanteDeCarreira());
    }
}
