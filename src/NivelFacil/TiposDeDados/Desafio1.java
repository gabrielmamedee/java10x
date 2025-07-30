package NivelFacil.TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        Ninja n1 = new Ninja(
                "Naruto",
                14,
                "missao teste",
                "A");

        Ninja n2 = new Ninja(
                "Sasuke",
                22,
                "missao 2",
                "a");

        n1.status();
        n1.concluirMissao();

        n2.status();
        n2.concluirMissao();
    }
}
