package aparcamiento;

/**
 *
 * @author natalie
 */

import java.util.GregorianCalendar;

public class Coche extends Vehiculo{
    private double ancho, alto;

    public Coche(String matricula, GregorianCalendar fechaEntrada, double ancho, double alto) {
        super(matricula, fechaEntrada);
        setAncho(ancho);
        setAlto(alto);
    }

    
    @Override
    public String calcularImporte()
    {
        String aux;
        long diff = (GregorianCalendar.getInstance().getTimeInMillis() - getFechaEntrada().getTimeInMillis()) / (60 * 1000);
 
        if ((ancho * alto ) > 8)
            aux = " Por " + diff+ " minutos de parking su coche debe "  + ((int)((diff * 3.5/60 ) * 100))/100.0  + "€.";
        else             
            aux = " Por " + diff+ " minutos de parking su coche debe "  + ((int)((diff * 2.5/60) * 100))/100.0 + "€.";
        return aux;
    }
   
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }    
    
}
