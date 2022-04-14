package desafios.Desafio_2;

// Import the Scanner class
import java.util.Scanner;

public class cavalo_e_ferradura {
    public static void main(String[] args) {
            
        try (// Create a Scanner object
        Scanner myObj = new Scanner(System.in)) {
            // Store the amount of horseshoes
            int qtdFerraduras = 4;

            // Store the price of a horseshoe
            double valorFerradura = 9.90;

            // Store the amount of horse
            int qtdCavalo = myObj.nextInt();
            System.out.println("Quantidade de cavalo: " + qtdCavalo);

            // Store the total price
            double valorTotal = (qtdFerraduras * valorFerradura) * qtdCavalo;
            System.out.println("Valor total: " + valorTotal);
        }
    }
}