package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * - Dados primitivos
        *   São tipos de dados que de maneira geral não recebem métodos de maneira padrão
        *
        * - Dados não primitivos
        *   São tipos de dados em que pode-se colocar metodos para fazer alteracoes na variavel sem que seja mudado
        *   seu escopo
        *
        *   Dados não primitivos: String, NivelFacil.Array, Class, enum
        *   Objetivo: Criar um ninja, e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // Tudo em CAPSLOCK
        System.out.println("nome = " + nomeUpperCase);
        System.out.println("nome = " + nome);
    }
}
