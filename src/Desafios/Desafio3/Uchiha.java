package Desafios.Desafio3;

// Herança. O Uchiha herda do Ninja
public class Uchiha extends Ninja {

    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial(){
        mostrarInformacoes();
        System.out.println("5 - habilidadeEspecial = " + habilidadeEspecial);
    }

}
