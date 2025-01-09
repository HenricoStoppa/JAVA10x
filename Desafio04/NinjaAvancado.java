package Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.nome + " usou " + this.habilidade.nomeHabilidade +
                " e causou mais dano por usar sua especialidade: " + this.especialidade + "!");
    }
}
