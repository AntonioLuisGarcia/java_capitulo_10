package ejercicio8;

public class Carta {
    
    private int numero;
    private String palo;

    private static String[] palos = {"oros","copas","espadas0","bastos"}; 

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
    public String toString(){
        return numero + " de " + palo;
    }
    
}
