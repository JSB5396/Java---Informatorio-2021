import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero entero: ");
        int nro1 = scan.nextInt();
        System.out.println("Ahora ingrese otro numero entero pero que sea menor al primero: ");
        int nro2 = scan.nextInt();
        System.out.println("fizzBuzzFuncion" + "(" + nro1 + "," + nro2 + ")"
                            + "\n" + fizzBuzzFuncion(nro1, nro2));
        scan.close();
    }   
    public static ArrayList<String> fizzBuzzFuncion(int nro1,int nro2) {
        ArrayList<String> lista = new ArrayList<String>();
        for (int i=nro1; i < nro2; i++) {
            if ((i % 2==0) && (i % 3==0)) {
                lista.add("FizzBuzz");
            } else if (i % 2==0) {
                lista.add("Fizz");
            } else if (i % 3==0) {
                lista.add("Buzz");
            } else {
                lista.add(String.valueOf(i));
            }
        }
        return lista;
    } 
}