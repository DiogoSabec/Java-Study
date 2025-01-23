package NivelIntermediario.NivelIntermediario3;

public abstract class Ninja implements EstrategiaDeBatalha {

    // TODO: Incluir 2 novos atributos: NumeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounin, Hokage
    String nome;
    String aldeia;
    int idade;
    int NumeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamando novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }
    @Override
    public void InteligenciaDeCombate() {
        System.out.println("Inteligencia ativada.");
    }

    @Override
    public void InteligenciaDeCombate(int qi) {

    }
}
