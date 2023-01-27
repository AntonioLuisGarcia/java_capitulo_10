package ejercicio17;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Elemento> carro;

    public Carrito(){
        carro = new ArrayList<>();
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

    @Override
    public String toString() {
        String pinta = "Contenido del carrito\n=====================\n";
        for (Elemento e : carro) {
        pinta += e + "\n";
        }
        return pinta;
  }
}
