import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class forma_de_pagamento_com_desconto {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale locale = new Locale ("pt", "BR");
            Locale.setDefault(locale);

            int quantidade;
            double desconto = 0.00, valor_unitario = 0.00, valor_total = 0.00, juros = 0.00;
            String forma_de_pagamento;

            System.out.print("Quantidade de itens: ");
            quantidade = input.nextInt();

            System.out.print("Valor unitário: ");
            valor_unitario = input.nextDouble();

            System.out.println("\nEscolha a forma de pagamento: \n");
            System.out.println("1 - à vista (dinheiro/cheque) - 15% de desconto");
            System.out.println("2 - à vista (cartão) - 5% de desconto");    
            System.out.println("3 - 2x no cartão - preço normal");
            System.out.println("4 - 6x no cartão - 10% de juros\n");
            forma_de_pagamento = input.next();

            DecimalFormat df = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);

            switch (forma_de_pagamento) {
                case "1":
                    forma_de_pagamento = "à vista (dinheiro/cheque)";
                    desconto = (quantidade * valor_unitario) * 0.15;
                    valor_total = (quantidade * valor_unitario) - desconto;

                    System.out.println("\nA forma de pagamento escolhida foi: " + forma_de_pagamento + "\n");
                    System.out.println("Valor total sem desconto é de: " + df.format((quantidade * valor_unitario)));
                    System.out.println("O valor do desconto foi de " + df.format(desconto));
                    System.out.println("O valor total a pagar é de " + df.format(valor_total));

                    break;
                case "2":
                    forma_de_pagamento = "à vista (cartão)";
                    desconto = (quantidade * valor_unitario) * 0.05;
                    valor_total = (quantidade * valor_unitario) - desconto;

                    System.out.println("\nA forma de pagamento escolhida foi: " + forma_de_pagamento + "\n");
                    System.out.println("Valor total sem desconto é de: " + df.format((quantidade * valor_unitario)));
                    System.out.println("O valor do desconto foi de " + df.format(desconto));
                    System.out.println("O valor total a pagar é de " + df.format(valor_total));

                    break;
                case "3":
                    forma_de_pagamento = "2x no cartão";
                    valor_total = quantidade * valor_unitario;

                    System.out.println("\nA forma de pagamento escolhida foi: " + forma_de_pagamento + "\n");
                    System.out.println("O valor total a pagar é de " + df.format(valor_total));

                    break;
                case "4":
                    forma_de_pagamento = "6x no cartão";
                    valor_total = quantidade * valor_unitario;
                    juros = (quantidade * valor_unitario) * 0.10;
                    valor_total = valor_total + juros;

                    System.out.println("\nA forma de pagamento escolhida foi: " + forma_de_pagamento + "\n");
                    System.out.println("Valor total sem juros é de: " + df.format((quantidade * valor_unitario)));
                    System.out.println("O valor do juros é de " + df.format(juros));
                    System.out.println("O valor total a pagar é de " + df.format(valor_total));

                    break;
                default:
                    System.out.println("Forma de pagamento inválida.");
                    break;
            }

            System.out.println("\nObrigado pela preferência!");

        }
        
    }
}
