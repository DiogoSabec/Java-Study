package NivelFacil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMisseoes = 10;

        /*
        Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        */
        if (numeroDeMisseoes == 10 && idade > 15) {
            System.out.println("Chunnin");
        } else if (numeroDeMisseoes >= 20) {
            System.out.println("Jounin");

        } else {
            System.out.println("Gennin");

        }
    }
}
