package ejerciciosrelacion6;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //3. Pide una cadena y un carácter por( teclado (valida que sea un carácter) y muestra cuántas veces
        //aparece el carácter en la cadena

        Scanner pregunta = new Scanner(System.in);
        
        String caracter = "";
        
        do {
            System.out.println("Dime carácter por teclado: ");
            caracter = pregunta.nextLine();
            if (caracter.length() != 1){
                System.out.println("No es válido");
            }  
        } while (caracter.length() != 1);



        
        System.out.println("Dime una cadena: ");
        String cadena = pregunta.nextLine();
        int contador = 0;
        
        //el igual son dos iguales. Ejemplo -> ==//
        //nombrevariable.lenght() tiene que tener una comparacion para que no te de fallo.

        for (int i = 0; i < cadena.length(); i++){
            String extrae = cadena.substring(i, i+1);
            if (extrae == caracter){
                contador++;
            } 
        }

        System.out.println(contador);
        pregunta.close();
       
    }
}
