package Casos;

import java.util.Scanner;

public class CalculadoraBasica {
	
	public static void main(String[] args) {
		
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        System.out.println("\n Elija el numero de la operación que quiera realizar:");
        System.out.println("(1) Suma '+'");
        System.out.println("(2) Resta '-'");
        System.out.println("(3) Multiplicación '*'");
        System.out.println("(4) División '/'");
        
        int opcion = leer.nextInt();
        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        leer.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

}
