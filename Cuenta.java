/**
 *
 * @author natalia
 */

package bancos;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cuenta
{

    private String numCuenta;
    private String titular;
    private double saldo;
    private GregorianCalendar fechaApertura;
    private ArrayList<Cliente> titulares;
    
    public Cuenta(String numCuenta, String titular, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
        fechaApertura=new GregorianCalendar();
        
        titulares  = new ArrayList<Cliente>();
    }   
    
    //Se deben proporcionar los métodos necesarios para insertar y borrar clientes y cuentas
    public void addTitular(Cliente nuevoTitular) {
         titulares.add(nuevoTitular);
    } 
    public void delTitular(Cliente titularABorrar) {
        titulares.remove(titularABorrar);                
    }    
    
    
    public void printTitulares() {
        for (int ind =0 ; ind < titulares.size(); ind++)
            titulares.get(ind).printInfo();
    }  
    

    public String getFechaApertura() {       
        return  DateFormat.getDateInstance(DateFormat.LONG).format(fechaApertura.getTime());
    }
    public void setFechaApertura(GregorianCalendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /*
     * Reescribir el código del ejercicio “Banco 1” de la sesión 4 de forma que los métodos ingresar y retirar puedan producir excepciones en las siguientes circunstancias:
     *      Si se intenta ingresar una cantidad negativa.
     *      Si se intenta retirar una cantidad mayor que el saldo de la cuenta.
     */
    
    /*
    * La aplicación tiene que hacer uso de la clase BancoException para la generación de las excepciones. 
    * Ejemplo de utilización: Si detectamos que queremos retirar más dinero del saldo que tenemos, 
    * ejecutaremos una sentencia como la siguiente:
    * throw new BancoException(BancoException.SALDO_INSUFICIENTE);
    */
    
    public void retirar(double retira) 
    {
        try {
            if (retira > saldo)
                throw new BancoException(BancoException.SALDO_INSUFICIENTE);      
            else
                saldo-=retira; 
        }
        catch (BancoException ex) {
             System.out.println("\t\t " + ex.getMessage());
        }
    }    
    public void  ingresar(double ingresa) {
                try {
            if (ingresa < 0)
                throw new BancoException(BancoException.CANTIDAD_NEGATIVA);      
            else
                saldo+= ingresa; 
        }
        catch (BancoException ex) {
             System.out.println("\t\t " + ex.getMessage());
        }        
    }
    
    
    

    
    public String  getInfo() {
        return  "\n\t Numero de Cuenta: \t"  +getNumCuenta() + "\n\t Titular: \t\t" + getTitular()+
                 "\n\t Saldo: \t\t" + getSaldo()+ "\n\t Fecha de Apertura: \t" + getFechaApertura() + ".\n";
    }    
    public void printInfo() {
         System.out.print( "\n\t Numero de Cuenta: \t"  +getNumCuenta() + "\n\t Titular: \t\t" + getTitular()+
                 "\n\t Saldo: \t\t" + getSaldo()+ "\n\t Fecha de Apertura: \t" + getFechaApertura() + ".\n");
    }

}


