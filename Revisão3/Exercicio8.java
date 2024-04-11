/**8. Escreva um código Java que imprima os números de 1 a 10.*/

import java.util.Scanner;


public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite uma sequencia de 0 a 10. Eu começo!");
        
        for(int i= 0; numero <10; i++){
            System.out.println(i);
            numero =i;
        }
        scanner.close();
    }
}