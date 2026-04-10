import java.util.ArrayList;
import java.util.Scanner;

public class caso_5{
    public static void main(String[] args) {
        
        ArrayList<String> estudiantes = new ArrayList<>();

        try (Scanner escaner = new Scanner(System.in)) {
            String nombre;
            
            while (true){
                try {
                    System.out.print("Ingrese el nombre los estudiantes:");
                    nombre = escaner.nextLine();
                    
                    if (nombre.equalsIgnoreCase("fin")){
                        break;
                    }
                    if(nombre.trim().isEmpty()){
                        System.out.println("El nombre no puede estar vacio. Intente de nuevo.");
                        continue;
                    }
                    estudiantes.add(nombre);
                } catch (Exception e) {
                    System.out.println("Ocurrió un error: " + e.getMessage());
                }
                System.out.println(String.join(", ", estudiantes));
            }
        }
        }
    }