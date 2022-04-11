import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b, soma;
            System.out.print("Digite um número: ");
            a = input.nextInt();

            System.out.print("Digite outro número: ");
            b = input.nextInt();

            soma = a + b;
            System.out.println("A soma dos números é: " + soma);
        }
    }
}