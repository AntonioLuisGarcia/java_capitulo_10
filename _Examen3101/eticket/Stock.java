package eticket;

import java.util.HashMap;
import java.util.Map;

/** Stock
 * Mantiene información sobre el stock de la tienda
 * Para facilitar las cosas se te indica como debe manejar el stock
 * haciendo uso de un HashMap
 * Por cada producto almacenado se tiene información de la cantidad
 * disponible del mismo
 * Debe poder:
 * - Añadir producto y retirar producto del stock
 * - Imprimir el stock de la tienda de la siguiente manera:
 * Ej:
 *    **********************************
 *    Código: 7
 *    Marca: C&A
 *    Modelo: G123456
 *    Nombre comercial: Vestido señora
 *    Precio: 119,95 €
 *    Stock disponible: 10
 *    **********************************
 *    Código: 1
 *    Marca: Levis
 *    Modelo: A123456
 *    Nombre comercial: Levis 501
 *    Precio: 79,95 €
 *    Stock disponible: 10
 * 
 * Al añadir producto recibirá el producto y la cantidad a añadir
 * Al retirar producto recibirá el producto y la cantidad a retirar.
 * Si el producto no existe deberá lanzar una execpción (ProductDoesNotExists)
 * Si no existe suficiente stock para retirar deberá lanzar una excepción (NotEnoughStock)
 * En el caso de que el producto no exista deberá lanzar una excepción
 * indicando de que el producto no existe.
 * En el caso de que no existan suficientes existencias deberá lanzar
 * una excepción indicando de que no hay suficiente stock.
 */
public class Stock {

    HashMap<Product, Integer> stock = new HashMap<Product, Integer>();

    public Stock(){
    }

    public void addProduct(Product product,int _stock){
        if(stock.containsKey(product)){
            stock.put(product,_stock + stock.get(product));
        }else{
            stock.put(product,_stock);
        }
    }

    public void allocateProduct(Product product, int amount)throws ProductDoesNotExists, NotEnoughStock{

        if(stock.containsKey(product)){

            if(stock.get(product) >= amount){
                stock.put(product,stock.get(product)-amount);
            }else{
                throw new NotEnoughStock();
            }

        }else{
            throw new ProductDoesNotExists();
        }
    }

    @Override
    public String toString(){
        String text = "**********************************\n";
        for(Map.Entry<Product,Integer> s : stock.entrySet()){
            text += s.getKey();
            text += "\nStock disponible: " + s.getValue() + "\n";
            text += "**********************************\n";
        }

        return text;
    }

}
