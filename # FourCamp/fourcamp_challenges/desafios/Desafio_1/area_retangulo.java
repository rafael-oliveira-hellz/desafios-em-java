package desafios.Desafio_1;

// Import the Scanner class
import java.util.Scanner; 

// Import the Locale class 
import java.util.Locale;

public class area_retangulo {
  public void calcularArea(String[] args) {

    // Create a Scanner object

    try (Scanner myObj = new Scanner(System.in)) {
      Locale.setDefault(new Locale("US"));

      // Prompt the user to enter the length of the rectangle
      System.out.println("Digite o valor do lado A: ");
      int b = myObj.nextInt();

      // Prompt the user to enter the height of the rectangle
      System.out.println("Digite o valor do lado B: ");
      int h = myObj.nextInt();

      // Print the area of the rectangle
      int area = b * h;
      System.out.println("A área do retângulo é: " + area);
    }
  }
}