package Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico GeninRandom = new NinjaBasico("Genin Aleatorio", 20, TipoHabilidade.GENJUTSU);
        GeninRandom.mostrarInformacoes();
        GeninRandom.executarHabilidade();

        System.out.println(" ");

        NinjaAvancado HokageFoda = new NinjaAvancado("Hokage Maneiro", 40, TipoHabilidade.RINNEGAN, "Fogo");
        HokageFoda.mostrarInformacoes();
        HokageFoda.executarHabilidade();
    }
}
