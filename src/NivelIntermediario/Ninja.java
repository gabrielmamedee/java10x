package NivelIntermediario;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    // Criar um metodo publico personalisado

    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja";
    }

    /*
    * Metodo int vai ter que retornar um int
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - this.idade;
    }

    // Metodo geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }
}
