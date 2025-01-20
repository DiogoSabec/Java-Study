package NivelIntermediario2;

public class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor Vazio, sem argumentos
    public Hokage() {
    }
    // Contrutor com argumentos
    public Hokage(String nome){
        // this.nome referencia ao nome da váriavel lá em cima, não o do construtor
        this.nome = nome;
    }

    public Hokage(int idade){
        // this.idade referencia váriavel idade la de cima, não o do construtor
        this.idade = idade;
    }

    //ALL ARGS CONSTRUCTOR
    public Hokage(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
