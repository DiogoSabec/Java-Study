package Desafio4;

public class NinjaMolde {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
    }

    public void executarHabilidade(){
        System.out.println("Meu nome é " + nome + " e minha habilidade é " + habilidade);
    }
}