/**
 *
 * @author natalia
 */

package bancos;

public class BancoException extends Exception 
{
    public static String SALDO_INSUFICIENTE = "No dispone de ese dinero en su cuenta.";
    public static String CANTIDAD_NEGATIVA = "No puede ingresar una cantidad negativa.";

    public BancoException() {
      super("Se ha producido una excepción en el banco.");
    }   

    public BancoException(String txt) {
        super(txt);
    }
}