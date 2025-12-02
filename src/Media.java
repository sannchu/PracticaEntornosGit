import java.util.Scanner;

public class Media {
    static void main() {
        // Inicializa el objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Variables para la suma y el conteo de los números ingresados
        double sumaTotal = 0;
        int contadorNumeros = 0;

        System.out.println("--- Calculadora de Media (Promedio) ---");
        System.out.println("Por favor, introduce números uno por uno.");
        System.out.println("Ingresa cualquier letra (como 'q' o 'fin') para detener la entrada y calcular la media.");
        System.out.print("Número 1: "); // Mensaje inicial de prompt

        // Bucle while: continúa pidiendo números mientras la entrada sea un número (double)
        while (scanner.hasNextDouble()) {

            // 1. Lee el número ingresado por el usuario
            double numero = scanner.nextDouble();

            // 2. Acumula la suma total
            sumaTotal += numero;

            // 3. Incrementa el contador
            contadorNumeros++;

            // Pide el siguiente número, mostrando el contador actualizado
            System.out.print("Número " + (contadorNumeros + 1) + ": ");
        }

        // Cierra el scanner para liberar recursos
        scanner.close();

        System.out.println("\n-------------------------------------");

        // 4. Muestra los resultados finales si se ingresaron números
        if (contadorNumeros > 0) {
            // Calcula la media (promedio)
            double media = sumaTotal / contadorNumeros;

            System.out.println("Total de números ingresados: " + contadorNumeros);
            System.out.println("Suma total: " + String.format("%.2f", sumaTotal)); // Formato para dos decimales
            System.out.println("La **media** de los números es: " + String.format("%.2f", media));
        } else {
            System.out.println("No se ingresó ningún número. No se puede calcular la media.");
        }
    }
}
