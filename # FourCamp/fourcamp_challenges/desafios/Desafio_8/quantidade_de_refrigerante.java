package desafios.Desafio_8;

import java.util.Scanner;
import java.util.Locale;

public class quantidade_de_refrigerante {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));

            // Define the variables

            int mlLatas = 350, mlGarrafas = 600, mlGarrafasPet = 2000, qtdeLatas = 0, qtdeGarrafas = 0, qtdeGarrafasPet = 0; 

            // Read the input

            System.out.println("Digite a quantidade de latas de refrigerante: ");
            qtdeLatas = input.nextInt();

            System.out.println("Digite a quantidade de garrafas de refrigerante: ");
            qtdeGarrafas = input.nextInt();

            System.out.println("Digite a quantidade de garrafas Pet: ");
            qtdeGarrafasPet = input.nextInt();

            // Calculate the total quantity of liters

            int subtotal = (mlLatas * qtdeLatas) + (mlGarrafas * qtdeGarrafas) + (mlGarrafasPet * qtdeGarrafasPet);

            int total = subtotal / 1000;

            // Print the result

            System.out.println("A quantidade em ml de refrigerante é: " + (subtotal) + " ml");
            System.out.println("A quantidade em litros de refrigerante é: " + (total) + " litros");
        }
    }
}
