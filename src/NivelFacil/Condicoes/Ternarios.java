package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        // São maneiras usadas para reduzir o código
        // variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja tem mais de 10 Missões" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);

        String resultado = (2 == 2) ? "s" : "Não";
        System.out.println("resultado = " + resultado);
    }
}
