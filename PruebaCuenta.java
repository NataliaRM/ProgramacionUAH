/**
 *
 * @author natalia
 */

package bancos;

public class PruebaCuenta {
    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("00001","Natalia Romero",500);
                
        System.out.print("Estado Inicial Cuenta 1: " + cuenta1.getInfo());
        System.out.print("\nCuenta 1 intenta ingresa -1200€: " +cuenta1.getInfo());
        cuenta1.ingresar(-1200);
        System.out.print("\nCuenta 1 intenta retira 9000€ :" +cuenta1.getInfo());
        cuenta1.retirar(9000);               
       
    }

}
