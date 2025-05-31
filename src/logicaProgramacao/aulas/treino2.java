package logicaProgramacao.aulas;

public class treino2 {

        public static void main(String[] args) {
            // Chamando a função 'somar' e guardando o resultado em uma variável
            int resultadoSoma1 = somar(5, 3); // Chama a função, passa 5 e 3
            System.out.println("A soma de 5 e 3 é: " + resultadoSoma1); // Imprime o resultado

            int numeroA = 10;
            int numeroB = 20;
            int resultadoSoma2 = somar(numeroA, numeroB); // Chama a função com variáveis
            System.out.println("A soma de " + numeroA + " e " + numeroB + " é: " + resultadoSoma2);

            // Podemos usar o retorno da função diretamente
            System.out.println("A soma de 7 e 2 é: " + somar(7, 2));
        }

        // Declaração da função 'somar'
        // Ela recebe dois parâmetros int e retorna um valor int
        public static int somar(int primeiroNumero, int segundoNumero) {
            int soma = primeiroNumero + segundoNumero; // Realiza a soma
            return soma; // Retorna o valor da soma
        }
    }
