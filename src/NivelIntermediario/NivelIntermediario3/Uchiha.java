package NivelIntermediario.NivelIntermediario3;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha() {
        super();
    }
    // Não usamos o "this." por que a variavel nao pertence a essa classe em específico, mas sim a Super Classe.
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void SharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. E eu ja completei " + NumeroDeMissoesConcluidas + " missões");
    }
}
