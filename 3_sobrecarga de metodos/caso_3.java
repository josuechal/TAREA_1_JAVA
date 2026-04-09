import java.util.Scanner;

public class caso_3 {
    public int sumar(int a, int b) {
        return a + b;
    }
    public double sumar(double a, double b) {
        return a + b;
    }
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    public String sumar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            caso_3 calculadora = new caso_3();
            
            System.out.println("=== CALCULADORA DE SOBRECARGA (SUMA) ===");
            System.out.println("1. int (2 numeros)");
            System.out.println("2. int (3 numeros)");
            System.out.println("3. double (2 numeros)");
            System.out.println("Elige una opcion (1-3): ");
            System.out.println("========================================");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el primer numero: ");
                    int a1 = sc.nextInt();
                    System.out.print("Ingresa el segundo numero: ");
                    int b1 = sc.nextInt();
                    System.out.println("Resultado: " + calculadora.sumar(a1, b1));
                }
                
                case 2 -> {
                    System.out.print("Ingresa el primer numero: ");
                    int a2 = sc.nextInt();
                    System.out.print("Ingresa el segundo numero: ");
                    int b2 = sc.nextInt();
                    System.out.print("Ingresa el tercer numero: ");
                    int c2 = sc.nextInt();
                    System.out.println("Resultado: " + calculadora.sumar(a2, b2, c2));
                }
                
                case 3 -> {
                    System.out.print("Ingresa el primer numero): ");
                    double a3 = sc.nextDouble();
                    System.out.print("Ingresa el segundo numero: ");
                    double b3 = sc.nextDouble();
                    System.out.println("Resultado: " + calculadora.sumar(a3, b3));
                }
                
                default -> System.out.println("Opción invalida");
            }
        }
    }
}
