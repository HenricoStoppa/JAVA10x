package Desafio03;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;

    public void mostrarInformações() {
        System.out.println("****** INFORMAÇÕES ******");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de Dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }

    /* GETTERS */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    /* SETTERS */

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }
}
