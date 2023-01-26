public class Carta {

    private static String[] numeros = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palos = {"bastos", "copas", "espadas", "oros"};

    private int numero;
    private String palo;

    public Carta(){
        this.numero = (int)(Math.random()*10);
        this.palo = palos[(int)(Math.random()*4)];
    }

    public String getNumero() {
        return numeros[numero];
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString(){
        return numeros[numero] + " de " + palo;
    }
}
