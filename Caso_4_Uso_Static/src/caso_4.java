import java.util.Scanner;

class Contador {
    private static int contador = 0;

    public Contador() {
        contador++;
    }

    public static int obtenerCantidadObjetos() {
        return contador;
    }
}

public class caso_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos objetos de tipo Contador deseas crear de forma automática?: ");

        int cantidad = 0;

        if (scanner.hasNextInt()) {
            cantidad = scanner.nextInt();

            for (int i = 0; i < cantidad; i++) {
                new Contador();
                System.out.println("Objeto " + (i + 1) + " creado.");
            }

            System.out.println("Total de objetos creados: " + Contador.obtenerCantidadObjetos());

        } else {
            System.out.println("Error: Por favor ingresa un número entero válido.");
        }

        scanner.close();
    }
}