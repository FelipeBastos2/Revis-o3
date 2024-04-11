import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero;
        int sorteio = random.nextInt(100);

        System.out.println("Vamos jogar? Advinhe um numero de 0 a 100!!");
        numero = scanner.nextInt();
        while (true) {
            if (numero==sorteio ) {
                System.out.println("Parabens!! Voce acertou");
                break;
            }
            else if (numero < sorteio) {
                System.out.println("Voce esta chegando! Aumente o numero");
                numero = scanner.nextInt();
            }
            else if (numero > sorteio) {
                System.out.println("Voce ultrapassou o numero! Diminua o numero");
                numero = scanner.nextInt();
            }
            else{
                System.out.println("Nao foi dessa vez, tente novamente!");
                numero = scanner.nextInt();
               
            }
           
        }
        scanner.close();
    }
}
