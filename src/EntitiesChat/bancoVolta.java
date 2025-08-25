package EntitiesChat;

public class bancoVolta {

    private String titular;
    private double saldo;

    public bancoVolta (String titular){
        this.titular = titular;
    }

    public bancoVolta (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo (){
        return saldo;
    }


    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void deposito ( double valor){
        saldo += valor;
    }
    public void saque (double valor){
        saldo -= valor;
    }

    public String toString (){
        return "Titular: " + titular
                + " Saldo: " + saldo;
    }

}
