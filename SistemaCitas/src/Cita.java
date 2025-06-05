public class Cita {
    private Doctor doctor;
    private Paciente paciente;
    private String fecha;

    public Cita(Doctor doctor, Paciente paciente, String fecha) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cita con " + doctor + " para " + paciente + " el " + fecha;
    }
}
