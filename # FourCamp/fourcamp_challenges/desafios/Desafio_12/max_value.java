package desafios.Desafio_12;

import java.util.Locale;
import java.util.Scanner;

public class max_value {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("pt", "BR"));
            
            // Read the first number
            System.out.println("Digite o primeiro valor: ");
            int a = input.nextInt();

            // Read the second number
            System.out.println("Digite o segundo valor: ");
            int b = input.nextInt();

            // Get the max number between the two
            int max_number = Math.max(a, b);
            System.out.println("O maior valor é: " + max_number);
        }
    }
}

