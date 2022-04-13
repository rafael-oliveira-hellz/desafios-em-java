import java.util.Scanner;
import java.util.Locale;

public class read_name_and_print_15_times {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            
            String name;
            int i;

            System.out.print("Enter your name: \n");
            name = input.nextLine();
            
            for (i = 1; i <= 15; i++) {
                System.out.println(i + " - Hello, " + name + "!");
            } 
        }
    }
}
