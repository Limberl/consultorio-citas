
package consultorio;

/**
 *
 * @author Jose Castillo
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(1, "Dra. Sanchez", "Dermatologia");
        Paciente paciente1 = new Paciente(1, "Juan Lopez");

        Cita cita = new Cita(1, java.time.LocalDateTime.now(), "Revisión de piel", doctor1, paciente1);

        System.out.println("Cita creada correctamente:");
        System.out.println("Doctor: " + cita.getDoctor().getNombre());
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Motivo: " + cita.getMotivo());
    }
}
