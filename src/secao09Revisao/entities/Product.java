package secao09Revisao.entities;
public class Product {
    public String name;
    public double price;
    public int quantity;

    /* public Product (){} <-- construtor padrão  */

    public Product(String name, double price, int quantity){

        /* this ajuda a diferenciar os atributos dos métodos e do objeto */
            this.name = name;
            this.price = price;
            this.quantity = quantity;
    }

    public Product(String name, double price){

        /* this ajuda a diferenciar os atributos dos métodos e do objeto */
        this.name = name;
        this.price = price;

        /* (this.quantity = 0;) <-- podemos deixar desse jeito, porém, por padrão, já instancia dessa forma, é apenas opcional
        A palavra "THIS" aqui em quantity também seria opcional, já que não existe o atributo quantity nesse construtor */
    }




    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}