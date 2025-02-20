package exercicio1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o valor 2: ");
        double valor2 = sc.nextDouble();

        byte opcao;

        do {

            System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Dividir
                0 - Sair""");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextByte();

            switch (opcao) {
                case 1 -> System.out.println("Resultado: " + (valor1 + valor2));
                case 2 -> System.out.println("Resultado: " + (valor1 - valor2));
                case 3 -> System.out.println("Resultado: " + (valor1 * valor2));
                case 4 -> System.out.println("Resultado: " + (valor1 / valor2));
            }
        } while(opcao != 0);
    }
}
