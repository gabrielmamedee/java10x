package NivelFacil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * ELSE IF
        * Objetivo: Passar o ninja de nível de acordo com o número de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 10;

        /*
        * if (condicao) { resultado }
        * else if (condicao) { resultado }
        * else { resultado caso nada seja verdadeiro}
        * */

        //se (condicao) {faca isso}
        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
