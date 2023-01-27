package ejercicio17;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Elemento> carro;

    public Carrito(ArrayList<Elemento> carro){
        this.carro = carro;
    }

    public void agrega(Elemento e){
        carro.add(new Elemento(e.getNombre(), e.getPrecio(), e.getCantidad()));
    }
    
    public int numeroDeElementos(){
        return carro.size();
    }

    public double importeTotal(){
        double total = 0;

        for(int i = 0 ; i < numeroDeElementos() ; i++ ){
            total += carro.get(i).getPrecio()* carro.get(i).getCantidad();
        }
        return total;
    }
}
