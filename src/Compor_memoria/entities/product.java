package Compor_memoria.entities;

public class product {
    private String produto;
    private double price;

    public product(String produto, double preco) {
        this.produto = produto;
        this.price = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
