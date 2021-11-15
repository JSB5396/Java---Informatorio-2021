import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro1, nro2;
        System.out.println("Por favor ingrese un numero entero: ");
        nro1 = scan.nextInt();
        System.out.println("Ahora ingrese otro numero entero: ");
        nro2 = scan.nextInt();
        System.out.println(nro1 + " X " + nro2 + " = " + multiplicacion(nro1, nro2));
        scan.close();
    }
    private static Integer multiplicacion(int nro1, int nro2) {
        int producto = 0;
        for (int i=1; i <= nro2; i++) {
            producto += nro1;
        }
        return producto;
    }
}