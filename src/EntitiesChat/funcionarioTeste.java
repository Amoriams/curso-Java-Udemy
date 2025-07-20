package EntitiesChat;

public class funcionarioTeste {
    public String nome;
    public String cargo;
    public double salario;


    public funcionarioTeste(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double aumentarSalario (double porcentagem){
        return salario += (salario * porcentagem) / 100;
    }

    public String toString (){
        return "O funcionario " + nome + ", exercendo o cargo de " + cargo
                + String.format(", ganha ao total de R$%.1f", salario);
    }
}
