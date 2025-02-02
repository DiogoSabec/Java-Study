package Desafios.Desafio6;

public class Ninja {
    private String nome;
    private int idade;
    private Vilas vila;

    public Ninja() {
    }

    public Ninja(String nome, int idade, Vilas vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public Vilas getVila() {
        return vila;
    }

    public void setVila(Vilas vila) {
        this.vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
