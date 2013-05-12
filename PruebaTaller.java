
package Coches;

import java.io.IOException;




/**
 *
 * @author natalia
 */
public class PruebaTaller {
    
    
    public static void main (String[] args) throws IOException{
    //creamos un coche
    Vehiculo coche1 = new Vehiculo("OUTATIME", "DeLorean", "DMC 12");
   
    //creamos piezas a reparar
    Piezas p1 = new Piezas ("Condensador de fluzo", 760);
    
    // añadimos la pieza al coche
    coche1.aniadirPieza(p1);
   
    //"creamos" el taller
    Taller miTaller = new Taller ("Reparaciones ", "916809837", 20);
    
    //mostramos por pantalla 
   
   System.out.println("Coche\n"+ coche1.toString()+ "\nEl precio de la reparacion es: "+ miTaller.repararVehiculo(coche1, 5) +"€") ;
         
    
  
  
  
  /*BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
  String ent = entrada.readLine();
  ent = entrada.readLine();
  Reparar.set_precio_hora(Double.parseDouble(ent));*/

  
  
    
    }
    
}
