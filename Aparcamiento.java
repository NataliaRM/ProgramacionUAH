package aparcamiento;

/**
 *
 * @author natalie
 */

import java.util.HashMap;

public class Aparcamiento {
    private int numPlazas;
    private HashMap coleVehiculos; 
        
    public Aparcamiento(int numPlazas) {
        this.numPlazas = numPlazas;
        coleVehiculos =  new HashMap();
    }    
 
    public void introducirVehiculo(Vehiculo nuevoV) throws AparcamientoException
    {
        if(coleVehiculos.containsKey(nuevoV.getMatricula()))
            throw new AparcamientoException(AparcamientoException.VEHICULO_DENTRO);
        else if (getNumPlazas() <= coleVehiculos.size())            
            throw new AparcamientoException(AparcamientoException.APARCAMIENTO_LLENO);
        else
            coleVehiculos.put(nuevoV.getMatricula(),nuevoV);        
    }
    
    public String sacarVehiculo(String matricula) throws AparcamientoException
    {
        Vehiculo vehiFuera ;
        String auxMensaje = null;
          if(coleVehiculos.containsKey(matricula))
          {
              vehiFuera = (Vehiculo)coleVehiculos.get(matricula);
              auxMensaje = vehiFuera.calcularImporte();
              coleVehiculos.remove(matricula);
          }      
          else 
               throw new AparcamientoException(AparcamientoException.VEHICULO_FUERA);
          
        return auxMensaje;
    }
    
    
    
    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public int getNumVehiculos() {
        return coleVehiculos.size();
    }
    
}
