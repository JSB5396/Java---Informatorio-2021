import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {              
        Empleado empleado1 = new Empleado("Juan Gomez", 30405602, 90, 800);
        Empleado empleado2 = new Empleado("Pedro Luis", 37909518, 110, 500);
        Empleado empleado3 = new Empleado("Ana Maria", 35137746, 90, 750);
        Empleado empleado4 = new Empleado("Victor Emanuel", 39782315, 120, 400);
        Set<Empleado> empleados = new HashSet<Empleado>();
        Collections.addAll(empleados, empleado1, empleado2, empleado3, empleado4);
        System.out.println("Lista de empleados: ");
        empleados.forEach(System.out::println);
        Map<Integer,Integer> datos = new HashMap<Integer, Integer>();
        datos.put(empleado1.getdni(), empleado1.sueldoCalculado());
        datos.put(empleado2.getdni(), empleado2.sueldoCalculado());
        datos.put(empleado3.getdni(), empleado3.sueldoCalculado());
        datos.put(empleado4.getdni(), empleado4.sueldoCalculado());
        System.out.println("\n" + "Datos pedidos: ");
        for (Map.Entry<Integer, Integer> entry : datos.entrySet()) {
           System.out.println("DNI: " + entry.getKey() +
            " - Sueldo mensual calculado: $ " + entry.getValue());
        }
    }
    public static class Empleado {
        private String nyA;
        private Integer dni;
        private Integer horasTrabajadas;
        private Integer valorPorHora;
        public Empleado(String nyA, Integer dni, Integer horasTrabajadas, Integer valorPorHora) {
            this.nyA = nyA;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
        @Override
        public String toString() {
            return "Nombre y Apellido: " + nyA + " - DNI: " + dni + " - Horas trabajadas: "
                    + horasTrabajadas + " - Valor por hora: " + valorPorHora;
        }
        public Integer getdni() {
            return dni;
        }
        public Integer sueldoCalculado(){
            return horasTrabajadas * valorPorHora;
        }
    }
}