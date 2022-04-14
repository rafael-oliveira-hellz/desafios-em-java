package desafios.Desafio_13;

import java.util.Scanner;
import java.util.Locale;

public class a_e_b_maior_que_c {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if ((a + b) > c) {
            System.out.println("a + b é o maior");
        } else {
            System.out.println("c é o maior");
        }

        sc.close();
    }
}