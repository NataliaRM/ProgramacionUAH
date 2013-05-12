
package Coches;

// librerias

import java.util.ArrayList;

/**
 *
 * @author natalia
 */
public class Vehiculo {
    //Atributos 
            private String matricula;
            private String marca;
            private String modelo;
            private ArrayList<Piezas> Listapiezas;
        
      
            // Constructor
        public Vehiculo(String matricula, String marca, String modelo){
            this.matricula=matricula;
            this.marca=marca;
            this.modelo=modelo;
            Listapiezas = new ArrayList();
          }
           
          public String getMatricula(){
              return matricula;
          }
          
          public void setMatricula(String matricula){
            this.matricula=matricula;
         }
          
          public String getMarca(){
              return marca;
          }
          
          public void setMarca (String marca){
              this.marca=marca;
          }
          
          public String getModelo(){
              return modelo;
          }
          
          public void setModelo (String modelo){
              this.modelo=modelo;
          }
          
          public ArrayList <Piezas> getlistapiezas(){
              return Listapiezas;
          }
          
          public void setlistapiezas (ArrayList <Piezas> listapiezas){
              Listapiezas=listapiezas;
          }
          public void aniadirPieza (Piezas pieza){
              Listapiezas.add (pieza);
          }
         
          public ArrayList getPiezas(){
              return Listapiezas;
          }

  @Override
    public String toString(){
        return "\nCoche: " +"\nModelo: " + this.modelo+"\nmarca: "+this.marca ;
    }
  

                
        }
        
       
