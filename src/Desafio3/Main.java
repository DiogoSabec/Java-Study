package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Uchiha[] listaUchihas = new Uchiha[5];
        int escolha1;
        boolean processo = true;
        while (processo) {
            Uchiha uchiha = new Uchiha();
            System.out.println("\n1 - Cadastrar Uchiha");
            System.out.println("2 - Listar Uchihas");
            System.out.println("3 - Deletar Uchihas");
            System.out.println("4 - Ver mais informações");
            System.out.println("5 - Sair");
            System.out.println();
            escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1) {
                case 1:

                    System.out.println("Espaços Disponíveis: ");
                    for (int i = 0; i < listaUchihas.length; i++) {
                        if (listaUchihas[i] == null) {
                            System.out.println(i + " - Espaço vazio. ");
                        }
                    }
                    System.out.println("Escolha um espaço vazio: ");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha2 > listaUchihas.length) {
                        System.out.println("Índice inexistente");
                    } else if (listaUchihas[escolha2] == null) {

                        System.out.println("Qual o nome do seu ninja? ");
                        uchiha.nome = scanner.nextLine();

                        System.out.println("Qual a habilidade do seu Ninja? ");
                        uchiha.habilidadeEspecial = scanner.nextLine();

                        System.out.println("Qual a idade do seu Ninja? ");
                        uchiha.idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Qual a dificuldade da missão do Ninja? ");
                        uchiha.nivelDificuldade = scanner.nextLine();

                        System.out.println("Qual o status da missão do Ninja? ");
                        uchiha.statusMissao = scanner.nextLine();


                        listaUchihas[escolha2] = uchiha;
                    } else {
                        System.out.println("Espaço ocupado.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < listaUchihas.length; i++) {
                        if (listaUchihas[i] == null) {
                            System.out.println(i + " - Espaço vazio.");
                        } else {
                            System.out.println(i + " - " + listaUchihas[i].nome + ", Sua Habilidade é: " + listaUchihas[i].habilidadeEspecial);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Escolha um Uchiha para deletar.");
                    for (int i = 0; i < listaUchihas.length; i++) {
                        if (listaUchihas[i] == null) {
                            System.out.println(i + " - Espaço vazio.");
                        } else {
                            System.out.println(i + " - " + listaUchihas[i].nome + ", Sua Habilidade é: " + listaUchihas[i].habilidadeEspecial);
                        }
                    }
                    int escolha3 = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha3 > listaUchihas.length) {
                        System.out.println("Índice inexistente");
                    } else if (listaUchihas[escolha3] == null) {
                        System.out.println("Já não existe Uchihas nesse espaço.");
                    } else {
                        listaUchihas[escolha3] = null;
                        System.out.println("Uchiha apagado.");
                    }
                    break;

                case 4:
                    System.out.println("\nSelecione uma opção");
                    System.out.println("1 - Alterar informações");
                    System.out.println("2 - Voltar");
                    int escolha4 = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha4){
                        case 1:
                            System.out.println("Escolha um Uchiha para alterar.");
                            for (int i = 0; i < listaUchihas.length; i++) {
                                if (listaUchihas[i] == null) {
                                    System.out.println(i + " - Espaço vazio.");
                                } else {
                                    System.out.println(i + " - " + listaUchihas[i].nome);
                                }
                            }

                            System.out.println("Qual ninja voce deseja alterar?");
                            escolha4 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Qual info voce deseja alterar?");
                            listaUchihas[escolha4].mostrarHabilidadeEspecial();

                            int escolha5 = scanner.nextInt();
                            scanner.nextLine();
                            switch (escolha5){
                                case 1:
                                    System.out.println("Qual o nome do seu ninja? ");
                                    uchiha.nome = scanner.nextLine();
                                    listaUchihas[escolha4].nome = uchiha.nome;
                                    break;
                                case 2:
                                    System.out.println("Qual a idade do seu Ninja? ");
                                    uchiha.idade = scanner.nextInt();
                                    scanner.nextLine();
                                    listaUchihas[escolha4].idade = uchiha.idade;
                                    break;
                                case 3:
                                    System.out.println("Qual a dificuldade da missão do Ninja? ");
                                    uchiha.nivelDificuldade = scanner.nextLine();
                                    listaUchihas[escolha4].nivelDificuldade = uchiha.nivelDificuldade;
                                    break;
                                case 4:
                                    System.out.println("Qual o status da missão do Ninja? ");
                                    uchiha.statusMissao = scanner.nextLine();
                                    listaUchihas[escolha4].statusMissao = uchiha.statusMissao;
                                    break;
                                case 5:
                                    System.out.println("Qual a habilidade do seu Ninja? ");
                                    uchiha.habilidadeEspecial = scanner.nextLine();
                                    listaUchihas[escolha4].habilidadeEspecial = uchiha.habilidadeEspecial;
                                    break;
                                default:
                                    System.out.println("Digite o número correto. ");
                                    break;
                            }
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Escolha uma opção válida.");
                    }
                    break;
                case 5:
                    System.out.println("Fechando programa");
                    processo = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida.");
                    break;
            }
        }
    }
}