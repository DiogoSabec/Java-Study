package Desafios.Desafio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        boolean processo = true;

        System.out.println("\nGERENCIAMENTO DE NINJAS:");

        while (processo) {
            System.out.println("\n1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Deletar Ninja");
            System.out.println("4 - Procurar Ninja");
            System.out.println("5 - Reordenar Listas");
            System.out.println("6 - Sair");
            System.out.println();

            int escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1) {
                case 1:
                    cadastrarNinja(scanner, listaNinjas);
                    break;
                case 2:
                    listarNinjas(listaNinjas);
                    break;
                case 3:
                    deletarNinjas(scanner, listaNinjas);
                    break;
                case 4:
                    procurarNinjas(scanner, listaNinjas);
                    break;
                case 5:
                    System.out.println("Reordenar por: ");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - Vila");

                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha2) {
                        case 1:
                            reordenarNome(listaNinjas);
                            break;
                        case 2:
                            reordenarIdade(listaNinjas);
                            break;
                        case 3:
                            reordenarVila(listaNinjas);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                    }
                    break;  // Corrigido para evitar cair no case 6 automaticamente
                case 6:
                    System.out.println("Fechando programa.");
                    processo = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida.");
            }
        }
        scanner.close();
    }

    private static void cadastrarNinja(Scanner scanner, LinkedList<Ninja> listaNinjas) {
        Ninja ninja = new Ninja();

        System.out.println("Qual o nome do seu ninja?");
        ninja.setNome(scanner.nextLine());

        System.out.println("Qual a idade do seu Ninja?");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next();
        }
        ninja.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual a vila do seu Ninja?");
        Vilas[] vilas = Vilas.values();
        for (int i = 0; i < vilas.length; i++) {
            System.out.println(i + " - " + vilas[i]);
        }

        int escolha = -1;
        while (escolha < 0 || escolha >= vilas.length) {
            while (!scanner.hasNextInt()) {
                System.out.println("Escolha um número válido.");
                scanner.next();
            }
            escolha = scanner.nextInt();
            scanner.nextLine();
        }

        ninja.setVila(vilas[escolha]);

        listaNinjas.add(ninja);
        System.out.println("Ninja cadastrado com sucesso!");
    }

    private static void listarNinjas(LinkedList<Ninja> listaNinjas) {
        if (listaNinjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado.");
            return;
        }

        for (int i = 0; i < listaNinjas.size(); i++) {
            Ninja ninja = listaNinjas.get(i);
            System.out.println(i + " - Nome: " + ninja.getNome() + ", Idade: " + ninja.getIdade() + ", Vila: " + ninja.getVila());
        }
    }

    private static void deletarNinjas(Scanner scanner, LinkedList<Ninja> listaNinjas) {
        if (listaNinjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado.");
            return;
        }

        listarNinjas(listaNinjas);
        System.out.println("Digite o número do Ninja que deseja deletar:");

        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next();
        }
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 0 || escolha >= listaNinjas.size()) {
            System.out.println("Índice indisponível.");
        } else {
            listaNinjas.remove(escolha);
            System.out.println("Ninja removido com sucesso!");
        }
    }

    private static void procurarNinjas(Scanner scanner, LinkedList<Ninja> listaNinjas) {
        System.out.println("Digite o nome do Ninja:");
        String nome = scanner.nextLine().trim();

        ArrayList<Ninja> resultados = new ArrayList<>();

        for (Ninja ninja : listaNinjas) {
            if (ninja.getNome().equalsIgnoreCase(nome)) {
                resultados.add(ninja);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Nenhum ninja encontrado.");
        } else {
            System.out.println("Resultados encontrados:");
            for (Ninja ninja : resultados) {
                System.out.println("Nome: " + ninja.getNome() + ", Idade: " + ninja.getIdade() + ", Vila: " + ninja.getVila());
            }
        }
    }

    private static void reordenarNome(LinkedList<Ninja> listaNinjas) {
        listaNinjas.sort(Comparator.comparing(Ninja::getNome));
        System.out.println("Lista ordenada por Nome.");
    }

    private static void reordenarIdade(LinkedList<Ninja> listaNinjas) {
        listaNinjas.sort(Comparator.comparingInt(Ninja::getIdade));
        System.out.println("Lista ordenada por Idade.");
    }

    private static void reordenarVila(LinkedList<Ninja> listaNinjas) {
        listaNinjas.sort(Comparator.comparing(ninja -> ninja.getVila().name()));
        System.out.println("Lista ordenada por Vila.");
    }
}
