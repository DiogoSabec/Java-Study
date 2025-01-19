package Condicoes;
import java.util.Scanner;

public class ScannersDoUsuario {
    public static void main(String[] args) {

//      Scanner é um OBJETO, podemos retratá-lo como uma Caixa que abre e fecha
//      O Scanner precisa sempre ser aberto, então nós CRIAMOS UM NOVO SCANNER (new)
//      E então nós pedimos para o Scanner "abrir" e a caixa poder receber conteúdos
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do seu Ninja: ");
        String nome = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nome);

        System.out.println("Escreva aqui a idade do seu Ninja: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idade + " anos");

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade, ainda precisa treinar mais.");
        }



//      Toda caixa precisa ser fechada para envio.
        caixaDeTexto.close();
    }
}
