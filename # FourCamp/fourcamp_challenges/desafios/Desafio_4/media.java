package desafios.Desafio_4;

import java.util.Scanner;
import java.util.Locale;

public class media {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));
            
            System.out.println("Digite o valor da primeira nota: ");
            double a = input.nextDouble();

            System.out.println("Digite o valor da segunda nota: ");
            double b = input.nextDouble();

            System.out.println("Digite o valor da terceira nota: ");
            double c = input.nextDouble();

            double media = (a + b + c) / 4;
            System.out.println("A média é: " + media);
        }
    }
}
