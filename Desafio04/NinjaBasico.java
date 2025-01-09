package Desafio04;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    // All Args Constructor
    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("===== INFORMAÇÕES =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade.nomeHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.nome + " usou " + this.habilidade.nomeHabilidade + "!");
    }
}
