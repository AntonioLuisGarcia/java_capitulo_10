package ejercicio18;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Elemento> carro;

    public Carrito(){
        carro = new ArrayList<>();
    }

    public void agrega(Elemento e){

        boolean esta = false;

        for(int i = 0 ; i < carro.size() ; i++){
            
            if(carro.get(i).getNombre().equals(e.getNombre())){
                carro.get(i).setCantidad(carro.get(i).getCantidad()+e.getCantidad());
                esta = true;
            }
        }

        if(!esta){
            carro.add(e);
        }

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
