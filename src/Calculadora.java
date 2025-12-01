import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n===== CALCULADORA SIMPLE =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        System.out.println("¡Gracias por usar la calculadora!");
        sc.close();
    }
}
