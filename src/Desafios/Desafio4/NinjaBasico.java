package Desafios.Desafio4;

public class NinjaBasico extends NinjaMolde implements Ninja{

    public NinjaBasico(){
    }
    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
