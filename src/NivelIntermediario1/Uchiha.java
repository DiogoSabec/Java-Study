package NivelIntermediario1;

// Herança. O Uchiha herda do Ninja
public class Uchiha extends Ninja{

    public void SharinganAtivado() {
        System.out.println("Sharingan ativado!");
    }

    /*
     *   Esse metodo existe na classe Ninja, e estamos sobreescrevendo o metodo do Ninja com esse metodo abaixo
     *   Por isso usamos o @Override
    */
    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha");
    }
}
