package exercicios.proprios.miniProjetos;
import java.util.Scanner;

/*
 * SOBRE AS CATEGORIAS DE VOTO NO BRASIL
 *
 * O sistema eleitoral brasileiro define três categorias de voto, com base na idade da pessoa:
 *
 * 1. VOTO PROIBIDO:
 *    - Para pessoas com menos de 16 anos.
 *    - Não é permitido votar.
 *
 * 2. VOTO FACULTATIVO:
 *    - Para jovens de 16 e 17 anos.
 *    - Também para idosos com 70 anos ou mais.
 *    - Votar é permitido, mas não é obrigatório.
 *
 * 3. VOTO OBRIGATÓRIO:
 *    - Para todos os cidadãos entre 18 e 69 anos.
 *    - O voto é exigido por lei, salvo em casos especiais (como problemas de saúde).
 *
 * Esse sistema busca equilibrar o direito ao voto com o respeito às diferentes faixas etárias,
 * incentivando a participação política de forma democrática e consciente.
 */


public class CategoriaVoto {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int anoNasn, idade;
        int anoIni = 2025;
        String opcao;

        do {
            System.out.println("---------------------------------");
            System.out.println("====== Verificador de Voto ======");
            System.out.println("[1] Verificar minha categoria de voto");
            System.out.println("[2] Saber como funciona o voto no Brasil");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextLine();
            System.out.println("---------------------------------");

            switch (opcao){
                case "1":
                    System.out.print("Digite o ano de seu nascimento: ");
                    anoNasn = sc.nextInt();
                    sc.nextLine();
                    idade = (anoIni - anoNasn);

                    System.out.println("Idade: " + idade);
                    if (idade < 16) {
                        System.out.println("Categoria: Voto proibido.");
                    }
                    else if (idade <= 17 || idade >= 70 ) {

                        System.out.println("Categoria: Voto facultativo.");
                    }
                    else if (idade >= 18 && idade <= 69) {

                        System.out.println("Categoria: Voto obrigatório");
                    }
                    System.out.println("---------------------------------");

                    break;

                    case "2":
                    System.out.println("No Brasil, o voto é classificado em três categorias:");
                    System.out.println("- Voto proibido: para menores de 16 anos.");
                    System.out.println("- Voto facultativo: para pessoas de 16 e 17 anos ou a partir dos 70 anos.");
                    System.out.println("- Voto obrigatório: para todos os cidadãos entre 18 e 69 anos.");
                    System.out.println("Essas regras garantem a participação democrática, respeitando diferentes faixas etárias.");
                    System.out.println("---------------------------------");
                    break;

                case "3":
                    System.out.println("Programa encerrado! Volte sempre!");
                    System.out.println("---------------------------------");
                    break;

                default:
                    System.out.println("Opção Inválida. Tente novamente.");
                    System.out.println("---------------------------------");
            }


        }while (!opcao.equals("3"));
        sc.close();
    }
}
