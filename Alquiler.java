package Puerto;


import java.util.GregorianCalendar;
public class Alquiler {
 //Atributo
    private GregorianCalendar f_inicial;
    private GregorianCalendar f_final;
    private int n_amarre;
    private Double precio_final;
    
    //Constructor
    public Alquiler(GregorianCalendar f_inicial, GregorianCalendar f_final, int n_amarre){
        this.f_inicial=f_inicial;
        this.f_final=f_final;
        this.n_amarre=n_amarre;
    }

  
    
    public GregorianCalendar getF_inical(){
        return f_inicial;
    }
    public void setF_inicial(GregorianCalendar f_incial){
     this.f_inicial=f_incial;   
    }
    public GregorianCalendar getF_final(){
        return f_final;
    }
    public void setF_final(GregorianCalendar f_final){
        this.f_final=f_final;
    }
    
    public double getN_amarre(){
        return n_amarre;
    }
    public void setN_amarre(double amarre){
        this.n_amarre=n_amarre;
    }
  
  
static double precioAlquiler ( Barco barco,int diferencia){
    
    double precio= diferencia*(barco.getEslora())*15/10;
    return precio;
}
   
    
}
