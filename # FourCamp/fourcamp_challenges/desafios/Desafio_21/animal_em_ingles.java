package desafios.Desafio_21;

import java.util.Scanner;

public class animal_em_ingles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String animal;
        
        System.out.print("Digite um dos animais a seguir - cachorro, gato, peixe, rato ou coelho: ");
        animal = sc.next();
        
        switch (animal.toLowerCase()) {
            case "cachorro":
                System.out.println("Dog");
                break;
            case "gato":
                System.out.println("Cat");
                break;
            case "peixe":
                System.out.println("Fish");
                break;
            case "rato":
                System.out.println("Mouse");
                break;
            case "coelho":
                System.out.println("Rabbit");
                break;
            default:
                System.out.println("Animal inválido");
                break;
        }
        
        sc.close();
    }
}
