package ApplicationChat;
import EntitiesChat.RPGBattle;

import java.util.Scanner;

public class Battlefield {
    public static void main (String [] rags){
        Scanner sc = new Scanner(System.in);
        String resp;
        RPGBattle per1;

        System.out.println("========== BEM VIND() À RUPTURA ==========");
        System.out.print("Digite o nome do seu personagem: ");
        String nome = sc.nextLine();
        System.out.print("Com qual classe irá se aventurar hoje: ");
        String classe = sc.nextLine();
        System.out.println("BEM VIND() " + classe + " " + nome + " JÁ POSSUI ALGUMA EXPERIENCIA EM BATALHA? (s/n): ");
        resp = sc.nextLine();

        if (resp.equalsIgnoreCase("s")){
            System.out.print("BOM TE VER NOVAMENTE NOS CAMPOS, O QUÃO BEM VOCÊ CONHECE ELES: ");
            int nivel = sc.nextInt();
            per1 = new RPGBattle(nome, classe, nivel, 100, 50);
            per1.tipoNivel(nivel);
        }else {
            per1 = new RPGBattle(nome, classe, 100, 50);
        }





















        sc.close();
    }
}
