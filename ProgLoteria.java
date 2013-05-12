
package ProgLoteria;

//importar librerias
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Random;

/**
 *
 * @author natalia
 */
public class ProgLoteria {

    // Delaración de var y arrays
    static String Njugados[] = new String[6];
    static String Gnumero[] = new String[6];

    public static void main(String[] args) throws IOException {

        // lleno array mientras que tenga rep                
        do {
            llenarArray();
        } while (tieneRep(Njugados));

        // lleno array ganador mientras que tenga rep                
        do {
            Sortear();
        } while (tieneRep(Gnumero));

        System.out.print("\nCombinación ganadora:");
        for (int i = 0; i < 6; i++) {
            System.out.print(Gnumero[i] + ",");
        }

        
        
        System.out.print("\nCombinacion jugada:");
        for (int i = 0; i < Njugados.length; i++) {
            System.out.print(Njugados[i] + ",");
        }


        int contacier = Comprobar(Njugados, Gnumero);
        System.out.println("\n Numero de aciertos: " + contacier);
    }

    public static void llenarArray() throws IOException {
        String cadenaEntrada = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        //Crear array con los numeros a jugar
        System.out.println("Introduzca combinacion jugada:");

        cadenaEntrada = entrada.readLine();
        Njugados = cadenaEntrada.split(",");
    }

    public static boolean tieneRep(String numeros[]) {
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i].equals(numeros[i + 1])) {
                return true;
            }
        }
        return false;
    }

    public static void Sortear() {
        //Crear aray con los numeros aleatorios
        //int Gnumero[] = new int[6];
        int i = 0, j;
        Gnumero[i] = "" + (int) (Math.random() * 49);
        for (i = 1; i < 6; i++) {
            Gnumero[i] = "" + (int) (Math.random() * 49);
            for (j = 0; j < i; j++) {
                if (Gnumero[i] == Gnumero[j]) {
                    i--;
                }
            }
        }

    }

    public static int Comprobar(String[] Njugados, String[] Gnumero) {

        int contacier = 0;

        for (int i = 0; i < Njugados.length; i++) {
            for (int j = 0; j < Gnumero.length; j++) {
                if (Njugados[i].equals(Gnumero[j])) {
                    contacier++;
                }
            }
        }
        return contacier;
    }
}
