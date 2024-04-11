/* Escreva um código Java que calcula a soma dos números pares de 1 a 100.
Imprima esses números.
 */



public class Exercicio10 {
    public static void main(String[] args) {
        int numPar=0;
        for(int i = 2; i<=100; i+=2)
        numPar+=i;
        System.out.println("Soma dos numeros pares: \n"+numPar);
    }
}
