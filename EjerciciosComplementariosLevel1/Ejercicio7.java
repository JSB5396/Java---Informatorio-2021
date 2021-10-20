import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String minuscula;
        System.out.println("Por favor ingrese un String (en minusculas): ");
        minuscula = scan.nextLine();
        System.out.println("El String en mayusculas es: " + convertirMayuscula(minuscula));
        scan.close();
    }
    public static String convertirMayuscula(String minuscula) {
        int i = 0;
        minuscula += '\0';
        char letras = ' ';
        String mayuscula = "";
        while (minuscula.charAt(i) != '\0') {
            if (minuscula.charAt(i) >= 'a' && minuscula.charAt(i) <= 'z')
                letras = (char) (minuscula.charAt(i) - 32);
            else
                letras = (char) (minuscula.charAt(i));
                mayuscula += letras;
                i++;
        }
        return mayuscula;
    }
}