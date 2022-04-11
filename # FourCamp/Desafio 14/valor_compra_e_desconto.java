import java.util.Scanner;
import java.util.Locale;

public class valor_compra_e_desconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorCompra, totalPagar;
        String formaPagto;

        System.out.println("Informe o valor da compra: ");
        valorCompra = sc.nextDouble();

        System.out.println("Informe a forma de pagamento: ");
        formaPagto = sc.next();

        if (formaPagto.equals("A Vista")) {
            totalPagar = valorCompra - (valorCompra * 0.10);
        } else {
            totalPagar = valorCompra - (valorCompra * 0.05);
        } 

        System.out.println("O valor total a pagar é: " + totalPagar);

        sc.close();
    }
}
