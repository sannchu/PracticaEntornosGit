import java.util.Scanner;

public class arbol {
public static void main(String[] args) {
    // 1. Inicialización del Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int altura;

        // 2. Pedir la altura del árbol
        System.out.println("🌲 Generador de Árbol de Navidad 🌲");
        System.out.print("Introduce la altura del árbol (un número entero): ");
        
        // 3. Capturar el número y asegurar que sea positivo
        if (scanner.hasNextInt()) {
            altura = scanner.nextInt();
        } else {
            System.out.println("Error: Por favor, introduce un número válido.");
            scanner.close();
            return; // Termina la ejecución si la entrada no es un número
        }

        // 4. Validar que la altura sea un número positivo
        if (altura <= 0) {
            System.out.println("La altura debe ser un número positivo.");
            scanner.close();
            return;
        }

        System.out.println("\n--- Tu Árbol de Altura " + altura + " ---");
        
        // 5. Generar el cuerpo del árbol (la pirámide)
        /* * Bucle exterior (for i): Controla cada fila o nivel del árbol.
         * Va desde 1 hasta la altura.
         */
        for (int i = 1; i <= altura; i++) {
            
            // a. Generar espacios: Imprime espacios en blanco para centrar los asteriscos.
            //    En la fila 'i', necesita (altura - i) espacios.
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            
            // b. Generar asteriscos: Imprime los asteriscos de la fila.
            //    En la fila 'i', necesita (2 * i - 1) asteriscos.
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // c. Salto de línea: Pasa a la siguiente fila.
            System.out.println();
        }
        
        // 6. Generar el tronco del árbol (la base)
        /* * Se genera una sola línea de tronco, centrado.
         * El tronco tiene el ancho de 1 asterisco, por lo que se centra con (altura - 1) espacios.
         */
        for (int l = 1; l <= altura - 1; l++) {
            System.out.print(" ");
        }
        System.out.println("|"); // El tronco puede ser un '|' o un '*'

        System.out.println("------------------------------------");
        scanner.close();
}
}
