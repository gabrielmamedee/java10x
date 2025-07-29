package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println("nivelDoNinja = " + nivelDoNinja);
    }
}
