package aparcamiento;

/**
 *
 * @author natalie
 */

import java.util.GregorianCalendar;

public abstract class Vehiculo {
    private String matricula;
    private GregorianCalendar fechaEntrada;

    public Vehiculo(String matricula,GregorianCalendar fechaEntrada) {
        setFechaEntrada(fechaEntrada);
        setMatricula(matricula);        
    }
    
   
    public abstract String calcularImporte();

    
    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}



