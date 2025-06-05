import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCitas {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Doctor> doctores = new ArrayList<>();
    private static final ArrayList<Paciente> pacientes = new ArrayList<>();
    private static final ArrayList<Cita> citas = new ArrayList<>();

    public static void altaDoctor() {
        System.out.print("Nombre del doctor: ");
        String nombre = scanner.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = scanner.nextLine();

        Doctor doctor = new Doctor(nombre, especialidad);
        doctores.add(doctor);

        System.out.println("Doctor registrado exitosamente.\n");
    }

    public static void altaPaciente() {
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        Paciente paciente = new Paciente(nombre, edad);
        pacientes.add(paciente);

        System.out.println("Paciente registrado exitosamente.\n");
    }

    public static void crearCita() {
        if (doctores.isEmpty() || pacientes.isEmpty()) {
            System.out.println("Debe haber al menos un doctor y un paciente registrados.");
            return;
        }

        System.out.println("Doctores disponibles:");
        for (int i = 0; i < doctores.size(); i++) {
            System.out.println((i + 1) + ". " + doctores.get(i));
        }
        System.out.print("Seleccione el número del doctor: ");
        int numDoctor = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println("Pacientes registrados:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + ". " + pacientes.get(i));
        }
        System.out.print("Seleccione el número del paciente: ");
        int numPaciente = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Fecha de la cita (dd/mm/aaaa): ");
        String fecha = scanner.nextLine();

        Cita cita = new Cita(doctores.get(numDoctor), pacientes.get(numPaciente), fecha);
        citas.add(cita);

        System.out.println("Cita creada exitosamente.\n");
    }

    public static void mostrarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.\n");
            return;
        }

        System.out.println("Citas registradas:");
        for (Cita cita : citas) {
            System.out.println("- " + cita);
        }
        System.out.println();
    }
}

