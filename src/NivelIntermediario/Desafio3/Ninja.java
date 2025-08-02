package NivelIntermediario.Desafio3;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;

    public Ninja(
            String nome,
            String statusMissao,
            String nivelDificuldade,
            String missao,
            int idade
    ) {
        this.nome = nome;
        this.statusMissao = statusMissao;
        this.nivelDificuldade = nivelDificuldade;
        this.missao = missao;
        this.idade = idade;
    }

    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("missao = " + missao);
        System.out.println("nivelDificuldade = " + nivelDificuldade);
        System.out.println("statusMissao = " + statusMissao);
    }

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
