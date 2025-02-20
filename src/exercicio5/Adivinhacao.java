package exercicio5;

import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSorteado = (int) Math.floor(Math.random() * 50);

        System.out.print("Digite um número de 1 a 50: ");
        int tentativa = sc.nextInt();

        System.out.println(numeroSorteado == tentativa ? "Você Acertouu!!!" : "Você errouu!!!");

        System.out.println("Número Sorteado: " + numeroSorteado);
        System.out.println("Sua tentativa: " + tentativa);
    }
}
