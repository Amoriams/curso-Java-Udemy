package ApplicationChat;
import EntitiesChat.Usuario;
import java.util.Scanner;

public class LoginFake {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nome, senha;

        Usuario u1 = new Usuario("admin", "123");
        Usuario u2 = new Usuario("julia.dev", "senha123");
        Usuario u3 = new Usuario("devzin", "java123");

        int tentativa =3;

        for (int i = 0; i < 3; i++) {

            System.out.println("=== LOGIN FAKE ===\n");
            System.out.print("Digite o nome do usuário: ");
            nome = sc.nextLine();
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();


            if (nome.equals(u1.nomeUsuario) && senha.equals(u1.senha) ||
                    nome.equals(u2.nomeUsuario) && senha.equals(u2.senha) ||
                    nome.equals(u3.nomeUsuario) && senha.equals(u3.senha)) {
                System.out.println("Bem vindo(a) de volta " + nome);
                break;
            } else {
                tentativa--;
                System.out.println("Dados incorretos. Tentativas restantes: " + tentativa);
            }

        }

        if (tentativa == 0) {
            System.out.println("🚫 Acesso bloqueado. Número máximo de tentativas atingido.");
        }


        sc.close();
    }
}
