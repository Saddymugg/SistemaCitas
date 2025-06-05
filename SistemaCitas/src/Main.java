import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DEL SISTEMA DE CITAS ---");
            System.out.println("1. Alta de doctor");
            System.out.println("2. Alta de paciente");
            System.out.println("3. Crear cita");
            System.out.println("4. Ver citas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> SistemaCitas.altaDoctor();
                case 2 -> SistemaCitas.altaPaciente();
                case 3 -> SistemaCitas.crearCita();
                case 4 -> SistemaCitas.mostrarCitas();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
