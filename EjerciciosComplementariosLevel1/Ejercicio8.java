import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner strScan = new Scanner(System.in);
        Scanner intScan = new Scanner(System.in);
        String nyA, direccion, ciudad;
        int edad;
        System.out.println("Por favor escriba su nombre y apellido: ");
        nyA = strScan.nextLine();        
        System.out.println("Ahora su edad: ");
        edad = intScan.nextInt();
        System.out.println("Luego su direccion: ");
        direccion = strScan.nextLine();
        System.out.println("Y finalemente la ciudad donde vive: ");
        ciudad = strScan.nextLine();
        Persona persona1 = new Persona(nyA, edad, direccion, ciudad);
        System.out.print(persona1.toString());
        strScan.close();
        intScan.close();
    }
    public static class Persona {
        private String nyA;
        private Integer edad;
        private String direccion;
        private String ciudad;
        public Persona(String nyA, Integer edad, String direccion, String ciudad) {
            this.nyA = nyA;
            this.edad = edad;
            this.direccion = direccion;
            this.ciudad = ciudad;
        }
        @Override
        public String toString() {
            return ciudad + " - " + direccion + " - " + edad + " - " + nyA;
        }
    }
}