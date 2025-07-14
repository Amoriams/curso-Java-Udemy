package EntitiesChat;

public class BoletimChat {

    public String nome;
    public double nota1, nota2, nota3;

    public void exibirInfo(){
        System.out.println("========== DADOS DO ALUNO ==========");
        System.out.println("NOME: " + nome);
        System.out.printf("NOTAS: %.1f || %.1f || %.1f\n", nota1, nota2, nota3);
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;

    }


    public String verificarStatus(){
        double media = calcularMedia();

        if (media >= 7){
            return "Aprovado";
        } else if (media >= 5 && calcularMedia() <7) {
            return "Recuperação";
        }else {
            return "Reprovado";
        }
    }

}
