import java.math.BigInteger;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero: ");
        int numero = scan.nextInt();

        System.out.println("El factorial de " + numero +
                            " es: " + factorial(numero));
        scan.close();
    }
    public static BigInteger factorial(int numero) {
        BigInteger resultado = BigInteger.valueOf(1);
        
        for (int i=1; i <= numero ; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i)); 
        }
        return resultado;
    }
}