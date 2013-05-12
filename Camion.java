package aparcamiento;

/**
 *
 * @author natalie
 */

import java.util.GregorianCalendar;

public class Camion extends Vehiculo{
    private int numRuedas;

    public Camion(String matricula, GregorianCalendar fechaEntrada,int numRuedas) {
        super(matricula,fechaEntrada);
        this.numRuedas = numRuedas;
    }

    
    @Override
    public String calcularImporte()
    {
        String aux;
        long diff = (GregorianCalendar.getInstance().getTimeInMillis() - getFechaEntrada().getTimeInMillis()) / (60 * 1000);
  
        if (numRuedas > 6)
            aux = " Por " + diff+ " minutos de parking su camion debe "  + 
                    ((int)((diff * 3.5 * (numRuedas/3) / 60 ) * 100))/100.0 + "€.";
        else             
            aux = " Por " + diff+ " minutos de parking su camion debe "  + ((int)((diff * 7/60 ) * 100))/100.0 + "€.";
        return aux;
    }
    
    
    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    
}
