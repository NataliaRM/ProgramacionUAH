/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto;

/**
 *
 * @author natalia
 */
public class Cliente {

  
//Atributo
    private String NIF;
    private String nombre;
    private String direccion;
    private int telefono;
    
    //Constructor
    public Cliente (String NIF, String nombre, String direccion, int telefono){
        this.NIF=NIF;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    public String getNIF(){
        return NIF;
    }
    public void setNIF(String Nif){
        this.NIF=NIF;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=nombre;
    }
    
    public String get_Direccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
     this.telefono=telefono;   
    }
    @Override
    public String toString(){
        return "\nCliente" +"\nNombre: " + this.nombre+"\nTeléfono: "+this.telefono;
    }

}
