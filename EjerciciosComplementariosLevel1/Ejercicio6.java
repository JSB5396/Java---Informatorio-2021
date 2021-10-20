import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro1, nro2;
        System.out.println("Por favor ingrese un numero entero: ");
        nro1 = scan.nextInt();
        System.out.println("Ahora ingrese otro numero entero: ");
        nro2 = scan.nextInt();
        System.out.println(nro1 + " elevedao a " + nro2 + " = " + potenciacion(nro1, nro2));
        scan.close();
    }
    public static Integer potenciacion(int nro1, int nro2) {
        Integer potencia = 1;
        for (int i=1; i <= nro2; i++) {
            potencia *= nro1;
        }
        return potencia;
    }
}