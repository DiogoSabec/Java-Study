package NivelIntermediario.NivelIntermediario1;

public class Uzumaki extends Ninja{

    public void ModoSabio(){
        System.out.println("Modo Sábio Ativado.");
    }

    /*
     *   Esse metodo existe na classe Ninja, e estamos sobreescrevendo o metodo do Ninja com esse metodo abaixo
     *   Por isso usamos o @Override
     */
    @Override
    public void HabilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki");
    }

}
