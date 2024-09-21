import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Jogo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Random geradorAleatorio = new Random();
        Scanner scanner = new Scanner (System.in);

        limparTela();


        int numero = geradorAleatorio.nextInt(101);
        int tentativaMaxima = 15;
        boolean acertou = false;

        System.out.println("Bem-Vindo(a) ao Jogo da Adivinhação!");
        System.out.println("Sua Missão é Acertar o Número Escolhido de 1 a 100.");
        System.out.println("Você tem " + tentativaMaxima + " tentativas.");
        System.out.println("Pressione ENTER para Começar!");
        scanner.nextLine();
        limparTela();

        for (int tentativas = 1; tentativas <= tentativaMaxima; tentativas++) {
            System.out.println("Tentativa " + tentativas + " de " + tentativaMaxima + ".");
            System.out.println("Digite um Palpite: ");
            int palpitejogador = scanner.nextInt();

            if (palpitejogador == numero) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o Número em " + tentativas + " de " + tentativaMaxima + " tentativas.");
                break;
            } else if (palpitejogador > numero) {
                System.out.println("O Número Sorteado é menor que " + palpitejogador + ".");
            } else {
                System.out.println("O Número Sorteado é maior que " + palpitejogador + ".");
            
            }
        }
            
        if (!acertou) {
            System.out.println("Infelizmente não foi desta vez!");
        }

        scanner.close();
    }
    
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }

    }    
