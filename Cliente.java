/**
 *
 * @author natalia
 */

package bancos;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Cliente {

    private String dni;
    private String nombre;
    private String direccion;   

    private ArrayList<Cuenta> cuentas;

    public Cliente(String dni, String nombre, String direccion, GregorianCalendar fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        
        cuentas  = new ArrayList<Cuenta>();
    }

    public void addCuenta(Cuenta nuevaCuenta) {
         cuentas.add(nuevaCuenta);
    } 
    public void delCuenta(Cuenta cuentaABorrar) {
        cuentas.remove(cuentaABorrar);                
    }    
    
    
    public void printCuentas() {
        for (int ind =0 ; ind < cuentas.size(); ind++)
            cuentas.get(ind).printInfo();
    }     
    
    

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
   
    
    public String  getInfo() {
        return "\n\t DNI: \t"  +getDni() + "\n\t Nombre: \t\t" + getNombre()+ "\n\t Direccion: \t\t" + getDireccion();
    }     
    public  void printInfo() {
         System.out.print( "\n\t DNI: \t"  +getDni() + "\n\t Nombre: \t\t" + getNombre()+ "\n\t Direccion: \t\t" + getDireccion());
    }

    
    
    
}
