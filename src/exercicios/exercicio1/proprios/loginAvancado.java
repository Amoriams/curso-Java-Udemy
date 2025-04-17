package exercicios.exercicio1.proprios;
import java.util.Scanner;

public class loginAvancado {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        String usuario, senha;
        String usuarioCorreto = "Admin";
        String senhaCorreta = "1234";
        int tentativa = 3;

        while (tentativa > 0){
            System.out.print("digite seu usuario: ");
            usuario = sc.nextLine();
            System.out.print ("digite sua senha: ");
            senha = sc.nextLine();

                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
                    System.out.print ("Bem-vinda ao sistema, " + usuario);
                    break;
                }
                else {
                    tentativa--;
                            if (tentativa > 0){
                                System.out.println("Usuario ou senha invalidos");
                                System.out.println (" voce tem mais " + tentativa + " tentativas");
                            }
                            else {
                                System.out.println("Numero de tentativas exxcedido, voce foi bloqueado!");
                            }
                }
        }
        sc.close();
    }
}
