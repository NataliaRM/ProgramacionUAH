
package Puerto;

/**
 *
 * @author natalia
 */
public class Barco {
 //Atributos
    private String matricula;
    private int eslora;
    private int anio_fabricacion;
   
    //Constructor
    public Barco (String matricula, int eslora, int anio_fabricacion){
        this.matricula=matricula;
        this.eslora=eslora;
        this.anio_fabricacion=anio_fabricacion;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public int getEslora(){
        return eslora;
    }
    public void setSEslora(int eslora){
        this.eslora=eslora;
    }
    
    public int getAnio_fabricacion(){
        return anio_fabricacion;
    }
    public void setAnio_fbricacion(int anio_fabricacion){
        this.anio_fabricacion=anio_fabricacion;
    }
     
}
