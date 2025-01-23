package Desafios.Desafio4;

public class NinjaAvancado extends NinjaMolde implements Ninja{

    String especialidade;

    // Construtores
    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
        System.out.println("especialidade = " + especialidade);
    }

    public void executarEspecialidade(){
        System.out.println("Meu nome é " + nome + " e minha especialidade é " + especialidade);
    }
}
