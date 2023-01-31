import java.util.ArrayList;
import java.util.HashMap;

/*
 * Ejercicio 23.
 * 
 * En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones, una torre 5 peones, un alfil 3,
 * un caballo 2 y un péon vale, lógicamente, 1 peón. Realiza un programa que genere al azar las capturas que ha 
 * hecho un jugador durante una partida. El número de capturas será un valor aleatorio entre 0 y 15. Hay que tener 
 * en cuenta que cada jugador tiene la posibilidad de capturar algunas de las siguientes piezas (no más): 1 dama, 
 * 2 torres, 2 alfiles, caballos y 8 peones. Al final debe aparecer la puntuación total.
 * 
 * @author Antonio Luis Garcia
 */

public class ejercicio23 {
    public static void main(String[] args) {
        HashMap<String,Integer> puntos = new HashMap<>();
        puntos.put("dama",9);
        puntos.put("torre",5);
        puntos.put("alfil",3);
        puntos.put("caballo",2);
        puntos.put("peon",1);

        HashMap<String, Integer> numeroPiezas = new HashMap<>();
        numeroPiezas.put("dama",1);
        numeroPiezas.put("torre",2);
        numeroPiezas.put("alfil",2);
        numeroPiezas.put("caballo",2);
        numeroPiezas.put("peon",8);
        
        ArrayList<String> piezas = new ArrayList<>();
        piezas.add("dama");
        piezas.add("torre");
        piezas.add("alfil");
        piezas.add("caballo");
        piezas.add("peon");

        int piezasAleatorias = (int)(Math.random()*16);
        int puntosTotales = 0;
        int piezaAleatoria;
        String pieza = "";

        for(int i = 0 ; i < piezasAleatorias ; i++){
            
            do{
                piezaAleatoria = (int)(Math.random()*piezas.size());
                pieza = piezas.get(piezaAleatoria);
            }while(0 == numeroPiezas.get(pieza));

            System.out.println(pieza + "(" + puntos.get(pieza) + " peones)");
            numeroPiezas.replace(pieza,numeroPiezas.get(pieza),numeroPiezas.get(pieza)-1);
            puntosTotales += puntos.get(pieza);
        }

        System.out.println("Puntos totale: " + puntosTotales);
    }
}
