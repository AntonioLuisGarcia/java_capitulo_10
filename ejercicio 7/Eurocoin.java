public class Eurocoin {
    
    private static String ultimoValor;
    private static String ultimaPosicion;
    private static int monedas = 0;
    private static String[] valores = {"1 cent","2 cent","5 cent","10 cent","20 cent","50 cent","1 euro","2 euro"};
    private static String[] posiciones = {"cara","cruz"};

    private String valor;
    private String posicion;

    public Eurocoin(){
        monedas++;
        this.valor = valores[(int)(Math.random()*8)];
        this.posicion = posiciones[(int)(Math.random()*2)];

        if(monedas == 1){
            ultimoValor = this.valor;
            ultimaPosicion = this.posicion;
        }else{
            if(this.valor != ultimoValor && this.posicion != ultimaPosicion){
                do{

                    this.valor = valores[(int)(Math.random()*8)];
                    this.posicion = posiciones[(int)(Math.random()*2)];

                }while(this.valor != ultimoValor && this.posicion != ultimaPosicion);
            }
        }
    }

    @Override
    public String toString(){
        return this.valor + " - " + this.posicion;
    }
}
