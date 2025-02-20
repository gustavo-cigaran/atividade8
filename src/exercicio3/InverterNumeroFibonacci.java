package exercicio3;

import java.util.Scanner;

public class InverterNumeroFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        fibonacci(n);

        System.out.print("\nDigite um número inteiro para inverter: ");
        int num = scanner.nextInt();
        System.out.println("Número invertido: " + inverterNumero(num));
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static int inverterNumero(int num) {
        int invertido = 0;
        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        return invertido;
    }
}
