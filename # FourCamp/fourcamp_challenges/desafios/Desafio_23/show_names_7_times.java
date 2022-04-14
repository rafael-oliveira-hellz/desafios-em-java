package desafios.Desafio_23;

import java.util.Scanner;
import java.util.Locale;

public class show_names_7_times {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            
            String name;
            int i;

            for (i = 0; i < 7; i++) {
                System.out.print("Enter your name: ");
                name = input.nextLine();
                System.out.println("Hello, " + name + "!");
            } 
        }
    }
}
