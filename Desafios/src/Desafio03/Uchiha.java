package Desafio03;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Minha habilidade especial é: " + habilidadeEspecial);
    }

    public void mostrarInformações() {
        super.mostrarInformações();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    /* GETTERS */

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    /* SETTERS */

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
