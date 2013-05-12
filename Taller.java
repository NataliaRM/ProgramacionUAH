
package Coches;

//librerias 

import java.util.ArrayList;
/**
 *
 * @author natalia
 */
public class Taller {

 
      private String nombre;
      private String telefono;
      private int precio_hora;
      
      //Constructor
      public Taller(String nombre, String telefono, int precio_hora){
           this.nombre=nombre;
           this.telefono=telefono;
           this.precio_hora=precio_hora;
      }

    
            
      public String getNombre (){
           return nombre;
      }
      
       public void setNombre(String nombre){
            this.nombre=nombre;
       }
            
      public String getTelefono(){
           return telefono;
      }
            
      public void setTelefono(String telefono){
          this.telefono=telefono;
      }
      
      public int getPrecio_hora(){
            return precio_hora;
      }
      
      public void setPrecio_hora(int precio_hora){
          this.precio_hora=precio_hora;
      }
            
      public void set_precio_hora (int precio_hora){
            if (precio_hora >=0)
                this.precio_hora=precio_hora;
      }
            
      public double repararVehiculo(Vehiculo coche, double horas){
         
       ArrayList <Piezas> Listapiezas = new ArrayList <Piezas>();
          Listapiezas = coche.getlistapiezas();
          double precio=0;
          for (int i=0; i<Listapiezas.size() ;i++){
              Piezas piezaReparar = Listapiezas.get(i);
              precio += piezaReparar.getPrecio();  
          }
          
          precio += precio_hora*horas;
          return precio;
          
          
      }
     

}
