import java.util.Scanner;
import java.util.Locale;

public class validate_data {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String name, email, rg, cpf;

        System.out.println("Informe seu nome: ");
        name = sc.next();

        System.out.println("Informe seu email: ");
        email = sc.next();

        while (!isValidEmailAddressRegex(email)) {
            System.out.println("Informe seu email: ");
            email = sc.next();
        }

        if (isValidEmailAddressRegex(email)) {
            System.out.println("Seu email é válido.  O e-mail  digitado foi: " + email);
        } else {
            System.out.println("Seu email é inválido");            
        }

        System.out.println("Informe seu rg: ");
        rg = sc.next();

        System.out.println("Informe seu cpf: ");
        cpf = sc.next();

        if (isValidName(name)) {
            System.out.println("Seu nome é válido");
        } else {
            System.out.println("Seu nome é inválido");
        }

        if (isValidRg(rg)) {
            System.out.println("Seu RG é válido");
        } else {
            System.out.println("Seu RG é inválido");
        }

        if (isValidCpf(cpf)) {
            System.out.println("Seu CPF é válido");
        } else {
            System.out.println("Seu CPF é inválido");
        }

        sc.close();
    }

    private static boolean isValidName(String name) {
        boolean isValidName = true;

        if (name.length() < 3) {
            isValidName = false;
            System.out.println("Seu nome é inválido, possui menos de 3 caracteres");
        }

        if (name.length() > 30) {
            isValidName = false;
            System.out.println("Seu nome é inválido, possui mais de 30 caracteres");
        }

        return isValidName;
    }

    private static boolean isValidRg(String rg) {
        boolean isValidRg = true;

        if (rg.length() < 9) {
            isValidRg = false;
            System.out.println("Seu RG é inválido, possui menos de 9 caracteres");
        }

        if (rg.length() > 11) {
            isValidRg = false;
            System.out.println("Seu RG é inválido, possui mais de 11 caracteres");
        }

        return isValidRg;
    }

    private static boolean isValidCpf(String cpf) {
        boolean isValidCpf = false;

        if (cpf != null && cpf.length() == 11) {
            int[] numbers = new int[11];
            int sum = 0;
            int rest = 0;
            int i = 0;

            for (i = 0; i < 11; i++) {
                numbers[i] = Integer.parseInt(cpf.substring(i, i + 1));
            }

            for (i = 0; i < 9; i++) {
                sum += (numbers[i] * (10 - i));
            }

            rest = sum % 11;

            if (rest < 2) {
                rest = 0;
            } else {
                rest = 11 - rest;
            }

            if (rest == numbers[9]) {
                sum = 0;

                for (i = 0; i < 10; i++) {
                    sum += (numbers[i] * (11 - i));
                }

                rest = sum % 11;

                if (rest < 2) {
                    rest = 0;
                } else {
                    rest = 11 - rest;
                }

                if (rest == numbers[10]) {
                    isValidCpf = true;
                }
            }
        }

        return isValidCpf;
    }

    private static boolean isValidEmailAddressRegex(String email) {
        boolean isEmailValid = true;

        if (email == null) {
            isEmailValid = false;
            System.out.println("O campo e-mail é obrigatório");
        }

        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(emailPattern, java.util.regex.Pattern.CASE_INSENSITIVE);
        assert email != null;
        java.util.regex.Matcher matcher = pattern.matcher(email);
        
        if (!matcher.matches()) {
            isEmailValid = false;
            System.out.println("O e-mail informado é inválido");
        }

        return isEmailValid;
    }
}
