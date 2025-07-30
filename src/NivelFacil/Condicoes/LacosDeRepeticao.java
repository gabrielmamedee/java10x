package NivelFacil.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de Repeticao: Vao repetir infinitamente ou ate voce atingir o parametro
         * WHILE = FOR
         * */

        //While
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximosDeClones = 40;

        while (numeroDeClones < numeroMaximosDeClones) {
            numeroDeClones++;
            System.out.println("O Naturo fez um clone" + numeroDeClones);
        }

        //For
        // for (variavel de controle; condição; incremento) {}
        for (int i = 0; i <= numeroMaximosDeClones; i++) {
            System.out.println("O Naruto esta se clonando e ja se clonou" + i);
        }
    }
}
