public class ValidarNombres {

    /*
    Haz un programa que, dada una lista de nombres de usuario, nos diga cuáles de
    ellos sí/no están bien escritos. Un nombre de usuario siempre empieza con “@”;
    luego tiene de 1 a 15 caracteres, que pueden ser letras (mayúsculas o minúsculas),
    guiones, guiones bajos o dígitos; después, un símbolo “#”; por último, 4 dígitos. Por
    ejemplo: “@Robert#0812”, “@drunk_elephant#9911” o “@The-Logan05#1919” son
    correctos. Ejemplos no válidos: “@Lind$ay#0051” (carácter “$” no admitido),
    “noname#4417” (no tiene “@”) o “@h_e_l_l#195” (le falta un dígito de los cuatro del
    final).
    */
    public static void main(String[] args) {
        // Lista de nombres de usuario a validar
        // Cada nombre debe empezar con @, tener entre 1 y 15 caracteres válidos
        String[] nombres = {
            "@Robert#0812",
            "@drunk_elephant#9911",
            "@h_e_l_l#195",
            "@Lind$ay#0051",
            "noname#4417"
        };

        // Expresión regular para validar los nombres de usuario
        // ^                 → empieza desde el principio de la cadena
        // ^@                → empieza con @
        // [A-Za-z0-9_-]{1,15} → 1 a 15 caracteres válidos (letras, números, - , _)
        // #                 → un #
        // [0-9]{4}$         → EXACTAMENTE 4 dígitos al final
        String expresion  = "^@[A-Za-z0-9_-]{1,15}#[0-9]{4}$";

        // Recorremos el array de nombres
        // Para cada nombre, comprobamos si coincide con la expresión regular
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];// Recorremos el array de nombres
            // Comprobamos si el nombre coincide con la expresión regular
            boolean valido = nombre.matches(expresion); // Comprobamos si el nombre coincide con la expresión regular
            // Imprimimos el resultado
            // Si es válido, mostramos "VÁLIDO", si no, "NO VÁLIDO"
            System.out.println(nombre + " es " + (valido ? "VÁLIDO" : "NO VÁLIDO"));
        }
    
        
    }
}

