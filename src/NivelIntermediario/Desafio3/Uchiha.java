package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{
    private String habilidadeEspecial;

    public Uchiha(
            String nome,
            String statusMissao,
            String nivelDificuldade,
            String missao,
            int idade,
            String habilidadeEspecial
    ) {
        super(nome, statusMissao, nivelDificuldade, missao, idade);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("habilidadeEspecial = " + habilidadeEspecial);
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("habilidadeEspecial = " + habilidadeEspecial);
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
