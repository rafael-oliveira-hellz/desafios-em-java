package desafios.Desafio_11;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class cavalo_e_ferraduras_condicoes {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale locale = new Locale ("pt", "BR");
            Locale.setDefault(locale);
            
            // Store the amount of horseshoes
            int qtdFerraduras = 4;

            // Store the price of a horseshoe
            double valorFerradura = 9.90;

            // Store the amount of horse
            int qtdCavalo = input.nextInt();
            System.out.println("Quantidade de cavalo: " + qtdCavalo);

            // Store the total price
            double valorTotal = (qtdFerraduras * valorFerradura) * qtdCavalo;

            DecimalFormat df =  (DecimalFormat) NumberFormat.getCurrencyInstance(locale);

            // Verify the amount of discount it will be given 
            if (valorTotal > 100) {
                System.out.println("O valor total é de: R$ " + df.format((valorTotal - (valorTotal * 0.10))));
            } else {
                System.out.println("O valor total é de: R$ " + df.format(valorTotal));
            }
        }
    }
}
