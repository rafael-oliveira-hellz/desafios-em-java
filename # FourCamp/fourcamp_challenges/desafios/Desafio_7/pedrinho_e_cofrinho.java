package desafios.Desafio_7;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class pedrinho_e_cofrinho {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale locale = new Locale ("pt", "BR");
            Locale.setDefault(locale);
            
            System.out.println("Digite quantas moedas de R$ 0,01 você possui: ");
            int oneCent = input.nextInt();

            System.out.println("Digite quantas moedas de R$ 0,05 você possui: ");
            int fiveCent = input.nextInt();

            System.out.println("Digite quantas moedas de R$ 0,10 você possui: ");
            int tenCent = input.nextInt();

            System.out.println("Digite quantas moedas de R$ 0,25 você possui: ");
            int twentyFiveCent = input.nextInt();

            System.out.println("Digite quantas moedas de R$ 0,50 você possui: ");
            int fiftyCent = input.nextInt();

            System.out.println("Digite quantas moedas de R$ 1,00 você possui: ");
            int oneReal = input.nextInt();

            double total = (oneCent * 0.01) + (fiveCent * 0.05) + (tenCent * 0.10) + (twentyFiveCent * 0.25) + (fiftyCent * 0.50) + (oneReal * 1);

            DecimalFormat df =  (DecimalFormat) NumberFormat.getCurrencyInstance(locale);

            System.out.println("O valor total das moedas é: R$ " + df.format(total));
        }
    }
}
