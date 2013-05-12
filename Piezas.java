
package Coches;


/**
 *
 * @author natalia
 */
public class Piezas {
         //Atributos
        private String nombre;
        private int precio;
    
        //Consturctor
        public Piezas (String nombre, int precio){
            this.nombre=nombre;
            this.precio=precio;
        }

    //Piezas(String string, int i) {
      //  throw new UnsupportedOperationException("Not yet implemented");
  //  }
            
        public String getNombre(){  
            return nombre;
        } 
        
         public void setNombre(String matricula){
            this.nombre=nombre;
         }
        
        public int getPrecio(){
            return precio;
        }      
        
        public void setPrecio(int precio){
            this.precio=precio;
        }
        
        
       public void set_Precio (int precio) {
           if (precio>=0)
            this.precio=precio;
       }
    }

