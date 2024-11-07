package ejerciciosrelacion6;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        //Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
        //introducida por teclado.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.println("Dime la subcadena que tengo que comprobar: ");
        String subcadena = scanner.nextLine();
        
        if (cadena.startsWith(subcadena)){
            System.out.println("Esta empezada por una subcadena");
        }

        else{
            System.out.println("No esta empezada por una subcadena");
        }

        
        scanner.close();
    }
        
            
    }

