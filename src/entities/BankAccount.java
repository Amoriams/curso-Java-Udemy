package entities;

public class BankAccount {
    private final int numeroConta;
    private String titular;
    private double saldo;


    public BankAccount(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial);

    }
    public BankAccount(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void deposito (double valor){
        saldo += valor;
    }

    public void saque (double valor){
         saldo -= valor + 5.0;
    }

    public String toString(){
        return "Conta: " + numeroConta
                + ", Titular: " + titular
                + String.format(", Saldo: R$%.2f", saldo);

    }

}
