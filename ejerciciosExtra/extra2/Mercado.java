package ejerciciosExtra.extra2;

import java.util.ArrayList;
import java.util.HashMap;

public class Mercado {
    
    ArrayList<Producto> merca;
    HashMap<String,Producto> productos;
    
    public Mercado(){
        this.merca = new ArrayList<>();
        this.productos = new HashMap<>();
    }

    public void anadirProducto(Producto p){
        
        if(productos.containsKey(p.getNombre())){
            System.out.println("Ya esta en la lista");
        }else{
            merca.add(p);
            productos.put(p.getNombre(),p);
        }
    }

    public void eliminarProducto(Producto product){
        if(productos.containsKey(product.getNombre())){
            merca.remove(product);
            productos.remove(product.getNombre());
        }else{
            System.out.println("no existe ese producto");
        }
    }

    public void listarProducto(){
        merca.forEach((producto)-> System.out.println(producto));
    }

    public void listarProducto(ArrayList<Producto> merca){
        merca.forEach((producto)-> System.out.println(producto));
    }

    public ArrayList<Producto> destacarProducto(String nombre){
        ArrayList<Producto> p =  new ArrayList<>();
        merca.forEach(producto->p.add(producto));
        p.removeIf(producto -> producto.getNombre()!=nombre);
        return p;
    }
    
}
