package NivelIntermediario;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    // Criar um metodo publico personalisado

    /*
    * O metodo VOID nao retorna valor nenhum!
    * */
    public void SharinganAtivado() {
        System.out.println("O sharingan Ativou!!");
    }

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
}
