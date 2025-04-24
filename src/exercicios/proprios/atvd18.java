package exercicios.proprios;

public class atvd18 {
    public static void main (String [] args){

        String usuario = "admin";
        String senha = "123";

        if (usuario.equals("admin") && (senha.equals("123"))){
            System.out.println("Login autorizado");
        }
        else {
            System.out.println("Login negado");
        }
    }
}
