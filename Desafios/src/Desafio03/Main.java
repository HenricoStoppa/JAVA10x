package Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ninja ninjaSimples = new Ninja();
        ninjaSimples.setNome("Kakashi Hatake");
        ninjaSimples.setIdade(37);
        ninjaSimples.setMissao("Comprar cachaça no bar");
        ninjaSimples.setNivelDificuldade("D");
        ninjaSimples.setStatusMissao("Em Andamento");
        ninjaSimples.mostrarInformações();

        System.out.println(" ");

        Uchiha Itachi = new Uchiha();
        Itachi.setNome("Itachi Uchiha");
        Itachi.setIdade(18);
        Itachi.setMissao("Matar o próprio clã");
        Itachi.setNivelDificuldade("S");
        Itachi.setStatusMissao("Concluida");
        Itachi.setHabilidadeEspecial("Sharingan");
        Itachi.mostrarInformações();
    }
}
