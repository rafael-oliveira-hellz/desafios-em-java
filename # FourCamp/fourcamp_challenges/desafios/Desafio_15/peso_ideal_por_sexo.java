package desafios.Desafio_15;

import java.util.Scanner;
import java.util.Locale;

public class peso_ideal_por_sexo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura;
        String sexo;
        
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Informe seu sexo (M / F): ");
        sexo = sc.next();

        if (sexo.equals("M")) {
            System.out.println("O seu peso ideal é: " + ((72.7 * altura) - 58));
        } else {
            System.out.println("O seu peso ideal é: " + ((62.1 * altura) - 44.7));
        }

        sc.close();
    }
}
