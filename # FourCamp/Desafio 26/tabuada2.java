import java.util.Scanner;
import java.util.Locale;

public class tabuada2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));
            
            // Reads the input
            System.out.println("Digite o número da tabuada: ");
            int n = input.nextInt();

            System.out.println("\n");
            System.out.println("****** Tabuada do " + n + " ******\n");
            
            // Prints the result for the first 10 numbers
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
