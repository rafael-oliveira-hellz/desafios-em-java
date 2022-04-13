import java.util.Scanner;

public class calcular_fatorial {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        input.close();
    }
}
