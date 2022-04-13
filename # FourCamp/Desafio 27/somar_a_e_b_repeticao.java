import java.util.Scanner;
import java.util.Locale;

public class somar_a_e_b_repeticao {
    public static void main(String[] args) {
        int a, b, soma;
        String continuar;
        boolean validacao = true;
        
        Scanner input = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);

        do {
            System.out.print("Digite o valor de A: ");
            a = input.nextInt();

            System.out.print("Digite o valor de B: ");
            b = input.nextInt();

            soma = a + b;

            System.out.println("\n****** Soma de A e B ******\n");

            System.out.println("A soma de A e B é: " + soma);

            System.out.print("\nDeseja continuar? (S/N): ");
            continuar = input.next();
            System.out.println("\n");

            if (continuar.equalsIgnoreCase("n")) {
                validacao = false;
                System.out.println("\n****** Fim do programa ******");
            } 
        } while (validacao);

        input.close();
    }   
}
