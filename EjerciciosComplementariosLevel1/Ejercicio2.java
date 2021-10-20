import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro1, nro2;
        System.out.println("Por favor ingrese un numero entero: ");
        nro1 = scan.nextInt();
        System.out.println("Ahora ingrese otro numero entero: ");
        nro2 = scan.nextInt();
        System.out.println(nro1 + " + " + nro2 + " = " + sumar(nro1, nro2) + "\n" +
                           nro1 + " - " + nro2 + " = " + restar(nro1, nro2) + "\n" +
                           nro1 + " * " + nro2 + " = " + multiplicar(nro1, nro2) + "\n" +
                           nro1 + " / " + nro2 + " = " + dividir(nro1, nro2) + "\n" +
                           nro1 + " % " + nro2 + " = " + modulo(nro1, nro2));
        scan.close();
    }
    public static Integer sumar(int nro1, int nro2) {
        return nro1 + nro2;
    }
    public static Integer restar(int nro1, int nro2){
        return nro1 - nro2;
    }
    public static Integer multiplicar(int nro1, int nro2) {
        return nro1 * nro2;
    }
    public static Integer dividir(int nro1, int nro2) {
        return nro1 / nro2;
    }
    public static Integer modulo(int nro1, int nro2) {
        return nro1 % nro2;
    }
}