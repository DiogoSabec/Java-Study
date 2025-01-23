package NivelIntermediario.NivelIntermediario3;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public Hatake() {
    }
    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void SharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }

    public void BoasVindas(){
        System.out.println("Oi");
    }

    @Override
    public void BemVindoAAnbu() {

    }

}
