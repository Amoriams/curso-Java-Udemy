package exercicios.proprios.miniProjetos;
import java.util.Scanner;

public class loginUsuario {
    public static void main (String [] args){

        String usuarioCorreto = "Admin";
        String senhaCorreta = "1234";
        Scanner sc = new Scanner (System.in);
        String usuario, senha;


        int tentativa = 3;

        while (tentativa > 0) {
            System.out.print("Nome de Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Senha: ");
            senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Bem-vindo(a) " + usuario + "!");
                break;
            }
            else {
                tentativa--;
                if (tentativa > 0){
                    System.out.println("Usuario ou senha incorretos!");
                    System.out.println("voce tem " + tentativa + " tentativas");
                }
                else {
                    System.out.println("Numero de tentativas exxcedido, voce foi bloqueado!");
                }
            }
        }
        sc.close();
    }
}
