package secao10Compor_memoria;

public class tipoRefeXtipoValor {
    public static void main (String [] args) {

        /* CLASSE SO TIPOS REFERÊNCIA
        * Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas.
        *
        *
        * Product p1, p2; (alocadas na area da memória chamada STACK (aloca variáveis declaradas no programa)
        * p1 = new Product ("TV", 900,00, 0); (vai ser alocada em outra área da memória chama HEAP (aloca os objetos em execução)
        * se p1 = p2; (por serem tipos referência, p2 vai começar a apontar para onde p1 aponta)
        *
        * Tipos referência aceitam o valor "null", que indica que a variável aponta para ninguém.
        *
        * Tipos primitivos são tipos valores. Tipos valores são caixas e não ponteiros.
        * Double x, y; (os valores vão ficar alocados na Stack, sem precisar de referência ou ponteiros para a Heap)
        * se X = 10 e a gente tentar atribuir Y = X (Y vai receber uma CÓPIA de X), ficando na Stack como Y = 10
        * boolean, char, byte, short, int, long, float, double <- (tipos primitivos)
        *
        * Quando alocamos (NEW) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos.

        *
        * */


    }

}