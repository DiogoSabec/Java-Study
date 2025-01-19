package Condicoes;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: servem para gerar casos específicos
        * Objetivo: usar scanners escolher entre os números
        * switchCase
        */

        // Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções
        System.out.println("Escolha o Personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        // Pedir pro usuário escolher 1 opção
        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Usuario escolheu o Naruto");
                break;
            case 2:
                System.out.println("Usuario escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Usuario escolheu A Sakura");
                break;
            default:
                System.out.println("Resposta inválida.");
        }


        // Fechar Caixa
        scanner.close();
    }
}
