import java.math.BigInteger;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero: ");
        int numero = scan.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        scan.close();
    }
    public static BigInteger factorial(int numero) {
        BigInteger resultado = BigInteger.ONE;
        BigInteger factoreo = BigInteger.valueOf(numero);
        if(numero == 1) {
            return resultado;
        } else {
            return factoreo.multiply(factorial(numero-1));
        }
    }
}