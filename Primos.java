import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese numero ");
        int numero = scanner.nextInt();
        
        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println( " Es un número primo.");
        } else {
            System.out.println( " No es un número primo.");
        }

        scanner.close();
    }
}
