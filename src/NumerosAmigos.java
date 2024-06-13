public class NumerosAmigos {

    // Función para calcular la suma de los divisores propios de un número
    public static int sumaDivisoresPropios(int n) {
        int suma = 0;
        // Iteramos desde 1 hasta n-1 para encontrar los divisores propios
        for (int i = 1; i < n; i++) {
            // Si i es un divisor de n, lo sumamos
            if (n % i == 0) {
                suma += i;
            }
        }
        // Retornamos la suma de los divisores propios
        return suma;
    }

    // Función para imprimir los divisores propios de un número
    public static void imprimirDivisoresPropios(int n) {
        System.out.print("Los divisores propios de " + n + " son: ");
        // Iteramos desde 1 hasta n-1 para encontrar y imprimir los divisores propios
        for (int i = 1; i < n; i++) {
            // Si i es un divisor de n, lo imprimimos
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de línea para claridad en la salida
    }

    // Función para determinar si dos números son amigos
    public static boolean sonAmigos(int num1, int num2) {
        // Calculamos la suma de los divisores propios de ambos números
        int suma1 = sumaDivisoresPropios(num1);
        int suma2 = sumaDivisoresPropios(num2);
        // Retornamos true si la suma de los divisores de num1 es igual a num2 y viceversa
        return suma1 == num2 && suma2 == num1;
    }

    // Función principal del programa
    public static void main(String[] args) {
        // Declaramos los números a verificar
        int num1 = 220;
        int num2 = 284;

        // Imprimimos los divisores propios de ambos números
        imprimirDivisoresPropios(num1);
        imprimirDivisoresPropios(num2);

        // Verificamos si son números amigos y mostramos el resultado
        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
    }
}
