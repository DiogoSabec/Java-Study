package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    // Construtores
    public ContaCorrente() {
    }
    public ContaCorrente(double saldo) {
        super(saldo);
    }
    public ContaCorrente(double saldo, TipoConta tipoConta, String donoDaConta) {
        super(saldo, tipoConta, donoDaConta);
    }

    public void ConsultarSaldo(){

    }

    public void Depositar(double valor){
        System.out.println("\nSeu saldo anterior é de R$" + saldo + " reais");
        saldo += valor;
        System.out.println("Serrá depositado um valor de R$" + valor + " reais");
        System.out.println("Seu saldo atual é de R$" + saldo + " reais");
    }


}
