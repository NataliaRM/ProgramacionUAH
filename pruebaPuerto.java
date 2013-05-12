package Puerto;

//impor librerias



import java.util.GregorianCalendar;



public class pruebaPuerto {
    
   

   public static void main(String[] args) {
        
        //Creamos cliente
       Cliente c1 = new Cliente ("12893256u", "Pedro Ruíz", "c/charco nº3", 912895496);
      
      // creamos barco1
    Barco b1= new Barco("3-CA-90-643-33", 78, 1999 );
      
      // cremos fechas 
    GregorianCalendar f_inicial = new GregorianCalendar (2000, 01, 15);
        GregorianCalendar f_final = new GregorianCalendar (2000, 01, 30);
       int diferencia = f_final.get(GregorianCalendar.DAY_OF_YEAR) - f_inicial.get(GregorianCalendar.DAY_OF_YEAR);
       double preciototal= Puerto.Alquiler.precioAlquiler(b1,diferencia);
      

   System.out.println("Cliente\n"+ c1.toString()+"\nEl precio del alquiler es: "+preciototal +"€");  
   }   
} 
        
       
     
    
    
             
            
            
   
       
       
      
      
        
       
        
      
        
       
        
        
        
        
        
       
       
       

