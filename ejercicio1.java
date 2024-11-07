package ejerciciosrelacion6;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        //1. Escribir por pantalla cada carácter de una cadena introducida por teclado.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dime una cadena de texto: ");
        String cadena = scanner.nextLine();
    
        for (int i = 0; i < cadena.length(); i++){
            System.out.println("Caracter" + i + ":" + cadena.charAt(i));
        }
        
        scanner.close();  
        
        //cadena.equals (" ")
        //System.out.println("Caracter" + i + ":" + cadena.substring(i, i+1));
        //El substring siempre tomara el valor de la posición anterior. Y con el + 1 va recorriendo la frase entera hasta que haya terminado.
        

    }
}
