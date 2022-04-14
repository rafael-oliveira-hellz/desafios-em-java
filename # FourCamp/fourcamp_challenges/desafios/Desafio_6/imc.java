package desafios.Desafio_6;

import java.util.Scanner;
import java.util.Locale;

public class imc {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(new Locale("US"));
                
            System.out.println("Digite o valor do peso: ");
            double peso = input.nextDouble();
                
            System.out.println("Digite o valor da altura: ");
            double altura = input.nextDouble();
                
            double imc = peso / (altura * altura);
            System.out.println("O IMC é: " + imc);           
        }
    }
}
