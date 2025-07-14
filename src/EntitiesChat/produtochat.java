package EntitiesChat;
    public class produtochat {
        public String nome;
        public double preco;
        public int quantidade;


        public void exibirInfo(){
            System.out.println("\n========== DADOS DO PRODUTO ==========");
            System.out.println("NOME: " + nome);
            System.out.printf("PREÇO: %.2f\n", preco);
            System.out.println("QUANTIDADE: " + quantidade);
        }

        public double calcularValorTotal(){

            return preco * quantidade;
        }
    }

