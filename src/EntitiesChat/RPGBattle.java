package EntitiesChat;

public class RPGBattle {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int mana;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public RPGBattle(String nome, String classe, int nivel, int vida, int mana) {

        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
    }

    public RPGBattle(String nome, String classe, int vida, int mana) {

        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
        this.mana = mana;
    }

    public void tipoNivel(int nivel){
        if (this.nivel > 1){
            this.vida = 100 + (100 * nivel) / 100;
            this.mana = 50 + (50 * nivel) / 100;
        }
    }

    public void tipoClasse(String classe){
        if (this.classe.equalsIgnoreCase("guerreiro")){
            System.out.println("Parabens " + nome + ", você recebeu uma ESPADA");
        }if (this.classe.equalsIgnoreCase("mago")){
            System.out.println("Parabens " + nome + ", você recebeu um CAJADO");
        } if (this.classe.equalsIgnoreCase("arqueiro")){
            System.out.println("Parabens " + nome + ", você recebeu um ARCO");
        }
    }


    public String toString (){
        return "Personagem: " + nome
                + ", Classe: " + classe
                + ", Nivel; " + nivel
                + ", Vida: " + vida
                + ", Mana: " + mana;
    }
}
