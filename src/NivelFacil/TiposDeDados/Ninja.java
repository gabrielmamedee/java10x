package NivelFacil.TiposDeDados;

public class Ninja {
    private String nome;
    private int idade;
    private String nomeMissao;
    private String dificuldade;
    private boolean satatusMissao;

    public Ninja(String nome, int idade, String nomeMissao, String dificuldade) {
        this.nome = nome;
        this.idade = idade;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.satatusMissao = false;
    }

    public void status() {
        System.out.println("------------------------------");
        System.out.println("nome = " + this.getNome());
        System.out.println("idade = " + this.getIdade());
        System.out.println("nomeMissao = " + this.getNomeMissao());
        System.out.println("dificuldade = " + this.getDificuldade());
        System.out.println("satatusMissao = " + this.isSatatusMissao());
    }

    public void concluirMissao() {
        if (this.getIdade() < 15) {
          if (!("C".equals(this.getDificuldade()) || "D".equals(this.getDificuldade()))) {
              System.out.println("Ninjas menores de 15 anos só podem concluir missões de nível C ou D");
          } else {
              this.setSatatusMissao(true);
              System.out.println("Ninja menor de 15 - Missão concluida");
          }
        } else {
            this.setSatatusMissao(true);
            System.out.println("Ninja maior de 15 - Missão concluida");
        }
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

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isSatatusMissao() {
        return satatusMissao;
    }

    public void setSatatusMissao(boolean satatusMissao) {
        this.satatusMissao = satatusMissao;
    }
}
