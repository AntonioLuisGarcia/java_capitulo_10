package ejerciciosExtra.extra2;

public class pruebaMercado {
    public static void main(String[] args) {
        Mercado mercadillo = new Mercado();

        mercadillo.anadirProducto(new Producto("Galletas", 1.5, 50, 4));
        mercadillo.anadirProducto(new Producto("Patatas", 2, 50,1));
        mercadillo.anadirProducto(new Producto("Carne", 3.47, 50, 2));
        mercadillo.anadirProducto(new Producto("Pescado", 5.48, 50, 5));

        mercadillo.listarProducto();

        System.out.println();
        
        mercadillo.listarProducto(mercadillo.destacarProducto("Galletas")); 
    }
}
