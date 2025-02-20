package exercicio6;

import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println("Quantidade de palavras: " + palavras.length);
    }
}
