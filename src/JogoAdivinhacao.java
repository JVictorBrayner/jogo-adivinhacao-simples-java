import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);

        int tentativa = 0;

        System.out.println("======================================");
        System.out.println("Bem-vindo ao Jogo de adivinhação!");
        System.out.println("======================================");
        System.out.println("Tente Adivinhar um número aleatório entre 1 e 100");

        while (tentativa != numeroAleatorio) {
            System.out.println("\nDigite o seu palpite: ");
            tentativa = sc.nextInt();

            if (tentativa < numeroAleatorio) {
                System.out.println("-> Errou! O número secreto é MAIOR.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("-> Errou! O número secreto é MENOR.");
            } else {
                System.out.println("\n### PARABÉNS! Você acertou! O número era "  + numeroAleatorio + "! ###");
            }
        }

        sc.close();
    }
}
