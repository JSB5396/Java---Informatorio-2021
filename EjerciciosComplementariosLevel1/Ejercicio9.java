import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un String: ");
        String cadena = scan.nextLine();
        System.out.println("Ahora ingrese una letra: ");
        char letra = scan.nextLine().charAt(0);
        System.out.println("La letra '" + letra + "' se repite " +
                            letraRepetida(cadena, letra) + " cantidad de veces");
        scan.close();
    }
    private static Integer letraRepetida(String cadena, char letra) {
        Integer cantidad = 0;
        char frase;
        for (int i=0; i < cadena.length(); i++) {
            frase = cadena.charAt(i);
            if (frase == letra)
                cantidad++;
        }
        return cantidad;
    }
}