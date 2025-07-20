package EntitiesChat;

public class ContaBancaria {
    public int numeroConta;
    public String nomeTitular;
    public double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }


    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque");
        } else {
            saldo -= valor;
        }
    }

    public String toString(){
        return "Conta: " + numeroConta + " | Titular: " + nomeTitular + " | saldo: " + String.format("R$%.2f", saldo);
    }
}
