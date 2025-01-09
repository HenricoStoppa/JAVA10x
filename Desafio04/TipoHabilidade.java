package Desafio04;

public enum TipoHabilidade {
    TAIJUTSU("TAIJUTSU"),
    NINJUTSU("NINJUTSU"),
    GENJUTSU("GENJUTSU"),
    KATON("KATON"),
    RINNEGAN("RINNEGAN");

    final String nomeHabilidade;

    TipoHabilidade (String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }
}
