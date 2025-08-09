package NivelIntermediario;

public class Uzumaki extends Ninja{

    public void ModoSabioAtivado() {
        System.out.println("Meu nome é " + this.nome + ". E eu ativei o modo Sabio");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }
}
