import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor coloque su nombre de usuario: "); 
        String nombre = scan.nextLine();
        
        System.out.println(saludar(nombre));
        scan.close();
    }
    public static String saludar(String nombre) {
        return "HOLA " + nombre;
    }
}