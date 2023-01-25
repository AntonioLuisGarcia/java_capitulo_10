package ejercicio9;

public class Carta implements Comparable<Carta> {
    
    private Integer numero;
    private String palo;

    private static String[] palos = {"oros","copas","espadas","bastos"}; 

    public Carta(){
        this.numero = (int)(Math.random()*12+1);
        this.palo = palos[(int)(Math.random()*4)];
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString(){
        return numero + " de " + palo;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }

        if(o.getClass() != getClass()){
            return false;
        }

        Carta c = (Carta) o;

        if(c.getNumero() != this.getNumero()){
            return false;
        }

        if(c.getPalo().equals(this.getPalo())){
            return false;
        }

        return true;
    }
    
    @Override
    public int compareTo(Carta c) {

        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
}
