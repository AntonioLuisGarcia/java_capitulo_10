package eticket;

/**TicketLine
 * Mantiene información de una línea de un ticket
 * Una línea contiene información del producto y la cantidad comprada del mismo
 * Debe poder:
 * - Devolver el producto de la línea
 * - Devolver la cantidad comprada del producto
 * - Modificar la cantidad comprada del producto
 * - Devolver el precio total de la línea (Cantidad*Precio del producto)
 * - Imprimir la línea del ticket de la siguiente manera:
 * ------------------------- 50 ---------------------       --- 10 ---       --- 10 ---
 * Levis 501                                          ( 1 x      79,95 € ) =      79,95 €
 */
public class TicketLine {

    private Product product;
    private int amount;
   
    
    public TicketLine(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Product getProduct(){
        return product;
    }
    
    @Override
    public String toString(){
        return String.format("%50s ( %s x %10.2f $ ) = %10.2f $", product.getModel(),getAmount(),product.getPrice(),getAmount()*product.getPrice());
    }
}
