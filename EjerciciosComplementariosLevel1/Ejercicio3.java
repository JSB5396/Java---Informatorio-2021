import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero: ");
        int numero = scan.nextInt();
        imprimirNum(numero);
        scan.close();
    }
    public static void imprimirNum(int numero) {
        for (int i = 1; i <= numero; ++i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}