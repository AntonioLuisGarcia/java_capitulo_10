package ejercicio9.ejercicio9;
import java.util.ArrayList;


public class ejercicio9{
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<>();
        Carta cartaAux;

        for(int i = 0 ; i < 10 ; i++){
            do{
                cartaAux = new Carta();
            }while(c.contains(cartaAux));
            c.add(cartaAux);
        }

        for(Carta d : c){
            System.out.println(d);
        }
    }
}

