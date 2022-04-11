import java.util.Scanner;
import java.util.Locale;

public class desconto_venda {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));
            
            System.out.println("Quantos itens foram vendidos? ");
            int n = input.nextInt();

            System.out.println("Digite o valor da venda: ");
            double v = input.nextDouble();

            double desconto = v * 0.05;

            double total = v - desconto;
            System.out.println("O valor da venda com desconto de 5% é: R$ " + total);
            System.out.println("O total de desconto é: R$ " + desconto);
            System.out.println("O valor da venda sem desconto é: R$ " + v);
            System.out.println("A quantidade de itens vendidos foi: " + n);
        }
    }
}
