package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        // Aplicando metodos aos meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem: " + Sasuke.idade + " entao fala: " + quantoTempoFalta);

        Ninja Sakura = new Ninja();
        Sasuke.nome = "Sakura Haruna";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
    }
}
