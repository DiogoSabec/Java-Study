package NivelFacil.TiposDeDados;

public class Array1 {
    public static void main(String[] args) {

        // "Quantos espaços do meu carro eu quero dar carona?"
        String[] ninja = new String[5];

        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";
        ninja[4] = "Kakashi";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

        System.out.println(ninja);


        int[] idade = new int[3];

        System.out.println(idade);


        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);


/*
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Naruto Uzumaki";
        String ninja3 = "Naruto Uzumaki";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
*/
    }
}
