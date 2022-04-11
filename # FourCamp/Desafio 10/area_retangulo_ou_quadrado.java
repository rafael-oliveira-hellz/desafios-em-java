import java.util.Scanner;
import java.util.Locale;

public class area_retangulo_ou_quadrado {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));

            // Define the variables
            int base, altura, area;

            // Read the input
            System.out.println("Digite a base do retângulo em cm: ");
            base = input.nextInt();

            System.out.println("Digite a altura do retângulo em cm: ");
            altura = input.nextInt();

            // Calculate the area
            area = base * altura;

            // Verify if it is a rectangle or a square
            if (base == altura) {
                System.out.println("É um quadrado e sua área é: " + (area/100) + " m²");
            } else {
                System.out.println("É um retângulo e sua área é: " + (area/100) + " m²");
            }
        }
    }
}
