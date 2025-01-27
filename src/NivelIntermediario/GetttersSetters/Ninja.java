package NivelIntermediario.GetttersSetters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private final double altura = 2.10;

    public Ninja() {
    }
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    // Get retorna o valor, Set muda o valor
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
     this.nome = nome;
    }
    public String getAldeia() {
        return aldeia;
    }
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }
    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
    public double getAltura() {
        return altura;
    }



}
