/*. Escreva um código Java que lê um número inteiro do usuário e imprime a sua
tabuada */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite qual numero voce quer ver a tabela. ");
        numero = scanner.nextInt();
        for(int i =1 ;i<=10; i++){
            System.out.println(numero+"x"+i+"="+(numero*i));
            
        }

            scanner.close();
        }

     
    }
    

