package exercicio2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String novaPalavra = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            char letra = palavra.charAt(i);

            novaPalavra += letra;
        }

        System.out.println((palavra.equalsIgnoreCase(novaPalavra)) ? "É um Palíndromo." : "Não é um Palíndromo.");
    }
}
