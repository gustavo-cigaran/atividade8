package exercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String primeiraPalavra = sc.nextLine().toLowerCase();
        System.out.print("Digite mais uma palavra: ");
        String segundaPalavra = sc.nextLine().toLowerCase();

        char[] array1 = primeiraPalavra.toCharArray();
        char[] array2 = segundaPalavra.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.equals(array1, array2) ? "É um Anagrama." : "Não é um Anagrama");
    }
}
