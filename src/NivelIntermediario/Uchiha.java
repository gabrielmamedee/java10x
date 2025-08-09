package NivelIntermediario;

public class Uchiha extends Ninja{
    /*
     * O metodo VOID nao retorna valor nenhum!
     * */
    public void SharinganAtivado() {
        System.out.println("O sharingan Ativou!!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e esse é meu ataque Uchiha");
    }
}
