package entities;

public class Employee {
    public String nome;
    public double salarioB;
    public double imposto;

    public double salarioLiquido(){

        return salarioB - imposto;
    }

    public double aumento(double porcentagem){
      return salarioB += (salarioB * porcentagem) / 100;
    }

    public String toString(){
        return nome +", $" + String.format("%.2f", salarioLiquido());
    }
}
