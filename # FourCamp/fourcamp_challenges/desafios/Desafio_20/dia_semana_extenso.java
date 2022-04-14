package desafios.Desafio_20;

import java.util.Scanner;
import java.util.Locale;

public class dia_semana_extenso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int dia;
        String dia_extenso;

        System.out.print("Digite um número de 1 a 7: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                dia_extenso = "Domingo";
                break;
            case 2:
                dia_extenso = "Segunda-feira";
                break;
            case 3:
                dia_extenso = "Terça-feira";
                break;
            case 4:
                dia_extenso = "Quarta-feira";
                break;
            case 5:
                dia_extenso = "Quinta-feira";
                break;
            case 6:
                dia_extenso = "Sexta-feira";
                break;
            case 7:
                dia_extenso = "Sábado";
                break;
            default:
                dia_extenso = "Dia inválido";
                break;
        }

        System.out.println("\nO dia " + dia + " corresponde a " + dia_extenso);

        sc.close();
    }
}
