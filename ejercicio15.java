/*
 * Ejercicio 15.
 * 
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si algún producto se repite en diferentes 
 * líneas, se deben agrupar en una sola. Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en el 
 * extracto se debe mostrar que se han pedido 4 botes de tomate. Después de teclear “fin”, el programa pide un código de descuento. 
 * Si el usuario introduce el código “ECODTO”, se aplica un 10% de descuento en la compra.
 * 
 * @author Antonio Luis Garcia 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio15 {
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
        String codigoDescuento = "";

        do{

            System.out.println("¿Que producto quiere?");
            producto = sc.nextLine();

            if(!producto.equals("fin")){
                
                System.out.println("¿Cuantas unidades?");
                unidad = Integer.parseInt(sc.nextLine());

                if(productos.contains(producto)){
                    int indice = productos.indexOf(producto);
                    int unidadesANteriores = unidades.get(indice);
                    unidades.set(indice,unidad+unidadesANteriores);
                }else{
                    productos.add(producto);
                    unidades.add(unidad);
                }
            }else{
                System.out.println("Ponga un codigo de descuento:");
                codigoDescuento = sc.nextLine();
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

            if(codigoDescuento.equals("ECODTO")){
                System.out.printf("TOTAL: %.2f", total*0.9);
                
            }else{
                System.out.printf("TOTAL: %.2f", total);
            }
    }
    
}
