package ejercicio14;

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
