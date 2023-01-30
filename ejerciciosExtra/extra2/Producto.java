package ejerciciosExtra.extra2;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    private int cantidad;
    private double total;

    public Producto(String nombre, double precio, int stock, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantidad = cantidad;
        this.total = cantidad*precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString(){
        return nombre + " - " + precio + " euros - " + cantidad + " unidades - Total: " + total + " euros";
    }
    
}
