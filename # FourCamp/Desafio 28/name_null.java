import java.util.Scanner;

public class name_null {
    public static void main(String[] args) {
        String nome;
        boolean validacao = true;

        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            if (!nome.isBlank()){
                validacao = false;
            } 
        } while (validacao);

        input.close();
    }
}
