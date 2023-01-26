package ejercicio14;

/*
 *
 * Ejercicio 14.
 * 
 *  Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. En esta 
 * primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto con su precio.
 * Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que indicar el producto y el número 
 * de unidades que se compran, por ejemplo “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
 * ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra “fin. Suponemos que el usuario no 
 * va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los nombres y precios de los
 * productos y una o varias listas para almacenar la compra que realiza el usuario.
 * 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        HashMap<String,Double> precios = new HashMap<>();

        precios.put("avena", 2.21);
        precios.put("garbanzos", 2.39);
        precios.put("tomate", 1.59);
        precios.put("jengibre", 3.13);
        precios.put("quinoa", 4.50);
        precios.put("guisantes", 1.60);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> unidades = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String producto = "";
        int unidad;

        do{

            System.out.println("¿Que producto quiere?");
            producto = sc.nextLine();

            if(!producto.equals("fin")){
                
                System.out.println("¿Cuantas unidades?");
                unidad = Integer.parseInt(sc.nextLine());
                productos.add(producto);
                unidades.add(unidad);
            }


        }while(!producto.equals("fin"));

        sc.close();

        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
    
        double total = 0;
    
        for (int i = 0; i < productos.size(); i++) {

            String product = productos.get(i);
            double precio = precios.get(product);
            int cantidad = unidades.get(i);
            double subtotal = precio * cantidad;
            total += subtotal;
            System.out.printf("%-8s %7.2f %6d  %7.2f\n", product, precio, cantidad, subtotal);
            }
            
            System.out.println("---------------------------------");
            System.out.printf("TOTAL: %.2f", total);
    }
    
}
