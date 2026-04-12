import java.util.Scanner;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " | Edad: " + this.edad + " años");
    }
}

public class caso_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Personas");

        System.out.println("\nDatos de la Persona 1:");
        System.out.print("Ingresa el nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        int edad1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\nDatos de la Persona 2:");
        System.out.print("Ingresa el nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        int edad2 = scanner.nextInt();

        Persona persona1 = new Persona(nombre1, edad1);
        Persona persona2 = new Persona(nombre2, edad2);

        System.out.println("\nResultados");

        System.out.print("Persona 1 -> ");
        persona1.mostrarDatos();

        System.out.print("Persona 2 -> ");
        persona2.mostrarDatos();

        scanner.close();
    }
}