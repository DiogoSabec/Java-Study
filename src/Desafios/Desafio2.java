package Desafios;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[5];
        int escolha1;
        System.out.println("a");

        boolean processo = true;
        while (processo){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1) {
                case 1:
                    System.out.println("Espaços Disponíveis: ");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                        System.out.println(i + " - Espaço vazio. ");
                        }
                    }
                    System.out.println("Escolha um espaço vazio: ");
                    int escolha2 = scanner.nextInt();
                    String nome = scanner.nextLine();

                    if (escolha2 > ninjas.length){
                        System.out.println("Índice inexistente");
                    } else if (ninjas[escolha2] == null) {
                        System.out.println("Qual o nome do seu ninja?: ");
                        nome = scanner.nextLine();
                        ninjas[escolha2] = nome;
                    } else {
                        System.out.println("Espaço ocupado.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < ninjas.length ; i++) {
                        if (ninjas[i] == null){
                            System.out.println(i + " - Espaço vazio.");
                        } else {
                            System.out.println(i + " - " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    processo = false;
                    break;

                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        }
    }
}
