package Compor_memoria.entities;

public class Ex_SalaDev {
    private String nome;
    private String email;


    public Ex_SalaDev(){

    }

    public Ex_SalaDev(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return nome + ", " + email;
    }

}
