package desafios.Desafio_16;

import java.util.Scanner;
import java.util.Locale;

public class peso_ideal_imc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;

        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

        sc.close();
    }
}
