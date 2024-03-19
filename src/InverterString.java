import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();

        String invertida = inverterString(original);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverterString(String original) {

        // Converter
        char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        // Inverter
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}