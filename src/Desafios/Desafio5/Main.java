package Desafios.Desafio5;

import Desafios.Desafio4.NinjaAvancado;
import Desafios.Desafio4.NinjaBasico;
import Desafios.Desafio4.NinjaMolde;
import Desafios.Desafio4.TipoHabilidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanhoLista = 5;
        ContaBancaria[] listaContas = new ContaBancaria[tamanhoLista];
        boolean processo = true;

        System.out.println("\nGERENCIAMENTTO DE CONTAS:");

        while (processo) {
            System.out.println("\n1 - Cadastrar Conta do Ninja");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Deletar Conta");
            System.out.println("4 - Fazer Transferencia");
            System.out.println("5 - Sair");
            System.out.println();

            int escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1) {
                case 1:
                    cadastrarConta(scanner, listaContas);
                    break;
                case 2:
                    listarContas(listaContas);
                    break;
                case 3:
                    deletarContas(scanner, listaContas);
                    break;
                case 4:
                    fazerTransferencia(scanner, listaContas, processo);
                    break;
                case 5:
                    System.out.println("Fechando programa.");
                    processo = false;
                    break;
                default:
                    System.out.println("Insira uma opção válida.");
            }
        }
    }
        public static void cadastrarConta(Scanner scanner, ContaBancaria[] listaContas){

            System.out.println("Escolha o Tipo de Conta para criar");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Ninja Poupança");

            int escolhaTipo = scanner.nextInt();
            scanner.nextLine();


            mostrarEspacosDisponiveis(listaContas);
            System.out.println("Escolha um espaço vazio:");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if (indice < 0 || indice >= listaContas.length) {
                System.out.println("Índice inexistente.");
                return;
            }

            if (listaContas[indice] != null) {
                System.out.println("Espaço ocupado.");
                return;
            }

            System.out.println("Qual o nome do seu ninja?");
            String donoDaConta = scanner.nextLine();

            System.out.println("Quanto de saldo você deseja depositar?");
            double deposito = scanner.nextDouble();
            scanner.nextLine();

            ContaBancaria conta;
            if (escolhaTipo == 1) {
                conta = new ContaCorrente(deposito, TipoConta.CORRENTE, donoDaConta);
            } else if (escolhaTipo == 2) {
                conta = new ContaPoupanca(0, TipoConta.POUPANCA, donoDaConta);
                conta.Depositar(deposito);
            } else {
                System.out.println("Escolha inválida!");
                return;
            }

            if (deposito <= 0) {
                System.out.println("Não é possível fazer essa transferência");
                return;
            }

            listaContas[indice] = conta;
            System.out.println("Ninja cadastrado com sucesso!");


        }

        public static void listarContas(ContaBancaria[] listaContas){
            for (int i = 0; i < listaContas.length; i++) {
                if (listaContas[i] == null) {
                    System.out.println(i + " - Espaço vazio.");
                } else {
                    System.out.println(i + " - Conta: " + listaContas[i].tipoConta + ", Dono: " + listaContas[i].donoDaConta + ", Saldo: " + listaContas[i].saldo);
                }
            }
        }

        public static void deletarContas(Scanner scanner, ContaBancaria[] listaContas) {
            listarContas(listaContas);
            System.out.println("Escolha um Ninja para deletar:");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if (indice < 0 || indice >= listaContas.length || listaContas[indice] == null) {
                System.out.println("Nenhuma conta encontrada nesse espaço.");
            } else {
                listaContas[indice] = null;
                System.out.println("Conta deletada com sucesso.");
            }
        }

        public static void fazerTransferencia(Scanner scanner, ContaBancaria[] listaContas, boolean processo){
            System.out.println("Seleciona o provedor: ");
            listarContas(listaContas);
            int escolhaTipo1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Seleciona o destinatário: ");
            int escolhaTipo2 = scanner.nextInt();
            scanner.nextLine();

            if (listaContas[escolhaTipo1] == null || listaContas[escolhaTipo2] == null){
                System.out.println("ERRO: Conta Inexistente");
                return;
            }

            System.out.println("Seleciona a quantidade desejada para transferir: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine();

            if (saldo > listaContas[escolhaTipo1].saldo) {
                System.out.println("Dinheiro Insuficiente");
            } else {
            listaContas[escolhaTipo1].saldo -= saldo;
            listaContas[escolhaTipo2].Depositar(saldo);

            }

        }

    private static void mostrarEspacosDisponiveis(ContaBancaria[] listaConta) {
        System.out.println("Espaços Disponíveis:");
        for (int i = 0; i < listaConta.length; i++) {
            if (listaConta[i] == null) {
                System.out.println(i + " - Espaço vazio.");
            }
        }
    }

}
