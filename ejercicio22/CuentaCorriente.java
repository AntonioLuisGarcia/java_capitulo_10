package ejercicio22;
import java.util.ArrayList;

public class CuentaCorriente{

    private long codigo;
    private double saldo;
    private ArrayList<String> movimiento;

    public CuentaCorriente(double saldo){

        this.saldo = saldo;
        this.codigo = (long)(Math.random()*(899999999)+100000000);
        this.movimiento = new ArrayList<>();
    }
    
    public CuentaCorriente(){
        this.saldo = 0;
        this.codigo = (long)(Math.random()*(899999999)+100000000);
        this.movimiento = new ArrayList<>();
    }

    public String toString(){
        return "Numero de cuenta: " + codigo + " Saldo: " + saldo;
    }

    public void ingreso(double aumento){
        saldo += aumento;
        movimiento.add("Ingreso de " + aumento + " euros Saldo: " + this.saldo + " euros");
    }
    
    public void cargo(double decremento){
        saldo -= decremento;
        movimiento.add("Cargo de " + decremento + " euros Saldo: " + this.saldo + " euros");
    }
    
    public void transferencia(CuentaCorriente cuenta, double dinero){
        this.saldo -= dinero;
        cuenta.saldo += dinero;
        movimiento.add("Transferencia encontra de " + dinero + " euros Saldo: " + this.saldo + " euros");
        cuenta.movimiento.add("Transferencia a favor de " + dinero + " euros Saldo: " + cuenta.saldo + " euros");
    }

    public void movimientos(){
        for(int i = 0 ; i < movimiento.size() ; i++){
            System.out.println(movimiento.get(i));
        }
    }
}