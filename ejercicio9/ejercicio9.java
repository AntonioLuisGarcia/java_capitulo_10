package ejercicio9;
import java.util.ArrayList;
import java.util.Collections;


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

        Collections.sort(c);

        for(Carta d : c){
            System.out.println(d);
        }
    }
}

