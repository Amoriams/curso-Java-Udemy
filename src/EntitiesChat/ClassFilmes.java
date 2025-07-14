package EntitiesChat;

public class ClassFilmes {
    public String titulo;
    public String genero;
    public double avaliacao;

    public void exibirInfo(){
        System.out.println("\n========== DADOS DO FILME ==========");
        System.out.println("TITULO: " + titulo);
        System.out.println("GÊNERO: " + genero);
        System.out.printf("AVALIAÇÃO: %.1f\n", avaliacao);
    }

    public String classificarFilme(){
        if (avaliacao >= 8){
            return "Excelente";
        } else if (avaliacao >= 5) {
            return "Bom";
        }else {
            return "Ruim";
        }
    }
}
