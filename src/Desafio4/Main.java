package Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinjaMolde[] listaNinjas = new NinjaMolde[5];
        boolean processo = true;

        while (processo) {
            System.out.println("\n1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninja");
            System.out.println("3 - Deletar Ninja");
            System.out.println("4 - Ver mais informações");
            System.out.println("5 - Sair");
            System.out.println();

            int escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1) {
                case 1 -> cadastrarNinja(scanner, listaNinjas);
                case 2 -> listarNinjas(listaNinjas);
                case 3 -> deletarNinja(scanner, listaNinjas);
                case 4 -> mostrarInformacoes(scanner, listaNinjas);
                case 5 -> {
                    System.out.println("Fechando programa.");
                    processo = false;
                }
                default -> System.out.println("Insira uma opção válida.");
            }
        }
    }

    private static void cadastrarNinja(Scanner scanner, NinjaMolde[] listaNinjas) {
        System.out.println("Escolha o Tipo de Ninja");
        System.out.println("1 - Ninja Básico");
        System.out.println("2 - Ninja Avançado");

        int escolhaTipo = scanner.nextInt();
        scanner.nextLine();

        NinjaMolde ninja;
        if (escolhaTipo == 1) {
            ninja = new NinjaBasico();
        } else if (escolhaTipo == 2) {
            ninja = new NinjaAvancado();
        } else {
            System.out.println("Escolha inválida!");
            return;
        }

        mostrarEspacosDisponiveis(listaNinjas);
        System.out.println("Escolha um espaço vazio:");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 0 || indice >= listaNinjas.length) {
            System.out.println("Índice inexistente.");
            return;
        }

        if (listaNinjas[indice] != null) {
            System.out.println("Espaço ocupado.");
            return;
        }

        System.out.println("Qual o nome do seu ninja?");
        ninja.nome = scanner.nextLine();

        System.out.println("Qual a habilidade do seu Ninja?");
        System.out.println("Lista de habilidades disponíveis:");
        for (int i = 0; i < TipoHabilidade.values().length; i++) {
            System.out.println(i + " - " + TipoHabilidade.values()[i]);
        }
        int habilidadeIndex = scanner.nextInt();
        scanner.nextLine();

        if (habilidadeIndex < 0 || habilidadeIndex >= TipoHabilidade.values().length) {
            System.out.println("Habilidade inválida.");
            return;
        }

        ninja.habilidade = TipoHabilidade.values()[habilidadeIndex];

        System.out.println("Qual a idade do seu Ninja?");
        ninja.idade = scanner.nextInt();
        scanner.nextLine();

        if (ninja instanceof NinjaAvancado avancado) {
            System.out.println("Qual a especialidade do Ninja Avançado?");
            avancado.especialidade = scanner.nextLine();
        }

        listaNinjas[indice] = ninja;
        System.out.println("Ninja cadastrado com sucesso!");
    }

    private static void listarNinjas(NinjaMolde[] listaNinjas) {
        for (int i = 0; i < listaNinjas.length; i++) {
            if (listaNinjas[i] == null) {
                System.out.println(i + " - Espaço vazio.");
            } else {
                System.out.println(i + " - " + listaNinjas[i].nome + ", Habilidade: " + listaNinjas[i].habilidade);
            }
        }
    }

    private static void deletarNinja(Scanner scanner, NinjaMolde[] listaNinjas) {
        listarNinjas(listaNinjas);
        System.out.println("Escolha um Ninja para deletar:");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 0 || indice >= listaNinjas.length || listaNinjas[indice] == null) {
            System.out.println("Nenhum ninja encontrado nesse espaço.");
        } else {
            listaNinjas[indice] = null;
            System.out.println("Ninja deletado com sucesso.");
        }
    }

    private static void mostrarInformacoes(Scanner scanner, NinjaMolde[] listaNinjas) {
        listarNinjas(listaNinjas);
        System.out.println("Escolha um Ninja para ver mais informações:");
        int i = scanner.nextInt();
        scanner.nextLine();

        if (i < 0 || i >= listaNinjas.length || listaNinjas[i] == null) {
            System.out.println("Nenhum ninja encontrado nesse espaço.");
        } else {
            listaNinjas[i].mostrarInformacoes();
            if (listaNinjas[i] instanceof NinjaAvancado avancado) {
                avancado.executarEspecialidade();
            }
        }
    }

    private static void mostrarEspacosDisponiveis(NinjaMolde[] listaNinjas) {
        System.out.println("Espaços Disponíveis:");
        for (int i = 0; i < listaNinjas.length; i++) {
            if (listaNinjas[i] == null) {
                System.out.println(i + " - Espaço vazio.");
            }
        }
    }
}
