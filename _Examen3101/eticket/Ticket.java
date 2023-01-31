package eticket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**Ticket
 * Mantiene información de un Ticket de compra
 * Debe almacenar el código del ticket que se genera automáticamente
 * empezando en 1, la fecha del ticket y las compras realizadas
 * Para facilitar las cosas se te indica como debe manejar los productos
 * del ticket haciendo uso de un HashMap (Obviamente debes haber implementado
 * la clase TicketLine antes que esta)
 * Debe poder:
 * - Obtener la fecha del ticket
 * - Obtener el código del ticket
 * - Añadir una cantidad de un producto determinado a la compra
 * - Quitar una cantidad de un producto determinado de la compra
 *   Si no existe el producto debe lanzar una excepción (ProductDoesNotExists)
 *   Si la cantidad de productos a retirar de un producto es mayor a la 
 *   que existe en el ticket debe lanzar una excepción (NotEnoughStock)
 * - Obtener el total de la factura de la compra
 * - Imprimir el ticket de la siguiente manera:
 *                                       Levis 501 ( 1 x      79,95 € ) =      79,95 €
 *                               Camisa strech fit ( 2 x      49,95 € ) =      99,90 €
 *                           Zapato caballero piel ( 3 x      99,95 € ) =     299,85 €
 *                                           Total 479,70 €
 */
public class Ticket {
    
    private HashMap<Product, TicketLine> purchase = new HashMap<Product, TicketLine>();
    private int codeTicket;
    private Date date;
    
    private static int amountTickets;
    
    public Ticket() {
        amountTickets++;
        this.codeTicket = amountTickets;  
        this.date = new Date(); 
    }
    
    public int getCodeTicket() {
        return codeTicket;
    }

    public Date getDate() {
        return date;
    }
    
    public void add(Product product,int amount){
        if(product == null){

        }else{
            if(purchase.containsKey(product)){
                purchase.get(product).setAmount(purchase.get(product).getAmount()+amount);
            }else{
                purchase.put(product,new TicketLine(product, amount));
            }
        }
    }

    public void remove(Product product,int amount)throws ProductDoesNotExists, NotEnoughStock{

        if(purchase.containsKey(product)){

            if(purchase.get(product).getAmount() >= amount){
                if(purchase.get(product).getAmount() == amount){
                    purchase.remove(product);
                }else{
                    purchase.get(product).setAmount(purchase.get(product).getAmount()-amount);
                }
            }else{
                throw new NotEnoughStock();
            }

        }else{
            throw new ProductDoesNotExists();
        }
    }

    @Override
    public String toString(){
        String text = "Ticket nº " + getCodeTicket() + "\nFecha: " + getDate() + "\n";
        double total = 0;

        for(Map.Entry<Product,TicketLine> p : purchase.entrySet()){
            text += p.getValue() + "\n";
            total += p.getKey().getPrice()*p.getValue().getAmount();
        }

        text += String.format("%50s %.2f $", "Total",total);
        return text;
    }
    
}
