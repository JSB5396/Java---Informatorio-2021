import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.parse("1982-10-29")),
                new Alumno("Lisa", "Simpson", LocalDate.parse("2013-05-12")),
                new Alumno("Bart", "Simpson", LocalDate.parse("2011-02-10")),
                new Alumno("Maggie", "Simpson", LocalDate.parse("2020-03-30")),
                new Alumno("Marge", "Bouvier", LocalDate.parse("1987-02-05")),
                new Alumno("Abbe", "Simpson", LocalDate.parse("1938-11-11")));
        Map<String, Integer> alumnosEdades = alumnos.stream()
                        .collect(Collectors.toMap(alumno -> nombreCompleto(alumno),
                                                  alumno -> calcularEdad(alumno))); 
        System.out.println(alumnosEdades);
    }
    private static String nombreCompleto(Alumno alumno) {
        return alumno.getNombre().concat(" ").concat(alumno.getApellido());
    }
    private static Integer calcularEdad(Alumno alumno) {
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }
    public static class Alumno {
        private String nombre;
        private String apellido;
        private LocalDate fechaDeNacimiento;

        public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public LocalDate getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }
        public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
        @Override
        public String toString() {
            return "Alumno [apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + 
            ", nombre=" + nombre + "]";
        }
    }
}   