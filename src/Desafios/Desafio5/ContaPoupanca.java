package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    //Construtores
    public ContaPoupanca() {
    }
    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    public ContaPoupanca(double saldo, TipoConta tipoConta, String donoDaConta) {
        super(saldo, tipoConta, donoDaConta);
    }

    public void Depositar(double valor){
        double percentual = 0.01;
        System.out.println("Serrá depositado um valor de R$" + valor + " reais com taxa de 1%");
        valor = valor - (percentual * valor);
        saldo += valor;

        System.out.println("O saldo atual é de R$" + saldo + " reais");
    }


}
