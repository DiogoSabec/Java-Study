package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{

    String donoDaConta;
    double saldo;
    TipoConta tipoConta;
    // Construtores
    public ContaBancaria() {}
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public ContaBancaria(double saldo, TipoConta tipoConta, String donoDaConta) {
        this(saldo);
        this.tipoConta = tipoConta;
        this.donoDaConta = donoDaConta;
    }

    public void ConsultarSaldo(){
        System.out.println("Seu saldo é de R$" + saldo + " reais");
    }

    public abstract void Depositar(double valor);

}
