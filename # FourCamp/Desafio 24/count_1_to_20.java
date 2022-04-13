import java.util.Scanner;
import java.util.Locale;

public class count_1_to_20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            
            int i;
            
            for (i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }
}
